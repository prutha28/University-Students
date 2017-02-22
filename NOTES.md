

#HTTP

### Introduction :

Web applications are not stand-alone applications. They involve communication between the client machine on one end and the server machine on the other. 

When 2 machines interact or communicate, they do so by following a set of rules/ syntax. This set of well accepted rules for communication between machines constitutes a <b><em>'protocol'</em></b>. There are several protocols used by machines, depending upon the type of communication intended. For example, FTP, HTTP, SMTP etc. These protocols exist in the application layer of the OSI model.

### History Of HTTP
While any two computers could communicate with each other in a number of ways, may be through FTP or email, there was no common and publicly available way to share and publish comments on documents. HTTP came into existence due to a need for researchers to read, publish and comment on research documents. These documents were designed as HTML documents, i.e. each document could contain references or hyperlinks to some other document. In order to transfer these documents, the HTTP protocol was designed.

HTTP or 'Hyper Text Transfer Protocol', is the protocol that machines use to send and receive HTML files (hypermedia files). HTML files are the documents that are written in "Hyper Text Markup Language", or HTML. These are special documents that contains links to other documents, the links being called 'hyper links' or 'hypermedia'. 

### Request Response Cycle

- A typical interaction between 2 machines viz. HTTP protocol, can be thought of as request-response cycle, consisting of an HTTP request and an HTTP response. 

- The machine that sends a request for a resource or for a web page is called the <em>'client'</em>; and the machine that serves the request and sends the response back to the client is called the <em>'server'</em>. 

- In the HTTP request-response cycle, the interaction is always initiated by the client and the server responds in return to serve the request. Therefore, the HTTP protocol is sometimes called a <em>PULL protocol.</em>

- Every HTTP request or response has a certain format. It consists of two parts- the headers and an optional payload(body). 

- The response body could be an HTML document or a JPEG image, or whatever that the server wants to send to the client.

- When the user types the URL in the address bar of the browser, the browser ( client ) initiates/opens a new connection with the server, whose host name specified in the URL and also fetches the document corresponding to the path specified in the URL.

- For example, if we type in http://www.udacity.com, the browser would first open a new connection with the server named "udacity.com" and secondly, since no explicit file path is specified, it would simply issue a GET request to the index.html on the udacity.com server. 

- After the client (e.g. browser) receives the response from the server, it starts parsing that response. The html page that it received could inturn contain references to other documents, such as CSS, JS etc. So the browser will again make new requests to the appropriate servers to fetch these additional resources. 

- This process of parsing the document and sending additional requests, if necessary, is repeated until all the necessary files are retrieved. 

- When the browser parses the HTML, it needs to somehow map the markup in the document to the elements that we see on the screen. How does that happen?

- When the browser parses the HTML markup, it automatically creates what we call the "DOM Tree", or the <em><b>"Document Object Model"</b></em>. Each "tag" in the html mark up corresponds to a new "node" in the DOM Tree. 

- The rules for creating the DOM Tree from the HTML markup is defined in the HTML specification. The markup is broken down into a set of tokens by the "Tokenizer" as per the rules defined in the specification.

- While the tokenizer does this, there is another process that consumes these tokens and converts them into node objects.

- After the tokenizer is done parsing the entire document, the DOM Tree is created. It describes the properties and content of each HTML tag and all the relationships between these nodes.

### HTTP Request

-----------------------------------------
| GET /pictures/kitty.jpg 	HTTP/1.1|	<------ Request Line ( HTTP Verb, File Path on the server, HTTP version)
|---------------------------------------|
|	Host: www.google.com 		|	
|       Date: Sat, 09 Feb 2015		|	<------ Optional Headers 
|	Accept: application/json	|
|	Agent: chrome-2.0		|
| 	Server: apache/1.3.29 		|
|	If-none-match : "0238faaghs"	|	<------- Version of the document present in the browser's cache
|					|	<------- Blank Line
|---------------------------------------|	
|	Some request message sent to 	|	<------- Request Body ( Optional )
|	the server.			|
|---------------------------------------|


A typical HTTP GET request looks something like this.
<pre>
	GET /animals/cat.html HTTP/1.1 
	host: www.google.com
	user-agent: chrome	
	accept: text/html 
	.
	... More headers
</pre>

- The first line is called the request line and consists of the HTTP verb, the file path( That's the path where the file lies on the server) and the version of HTTP being used. 
- This is then followed by a set of headers. All headers are optional except the "Host" header, which specifies which host you are trying to access.
- Headers consists of all the meta information/additional information that the client can send to the server. A header is a key value pair separated by a ':'
- A request can also contain the reuqest body. This is not needed in case of GET & DELETE requests. However, in case of POST and PUT requests, the request body usually contains the message body.


### HTTP Response

|---------------------------------------|
|	HTTP/1.1 200 OK			| <------ Status Line ( HTTP Version, Status Code, Reason phrase in plain english)
|---------------------------------------|
|	date: Sat, 09 Feb 2015		| <------ Optional Headers ( All headers are optional, except the "Content-Length")
|	content-type: application/json	|
| 	server: apache/1.3.29 		|
|	content-length : 80		|
|	etag : "023046872839829faaghs"	|
|					|<------- Blank Line
|---------------------------------------|	
|	Some message body returned by 	|<------- Response Body 
|	the server.			|
|---------------------------------------|


### Some Common Response headers

Headers contain additional data about requests or responses. These are some of the important ones:

<b>Content-Length</b> is a header that must be contained in every response and tells the browser the size of the body in the response. This way the browser knows how many bytes it can expect to receive after the header section and can show you a meaningful progress bar when downloading a file.

<b>Content-Type</b> is also a non-optional header and tells you what type the document has. This way the browser knows which parsing engine to spin up. If it's an image/jpeg, show the image. It’s text/html? Let’s parse it and fire off the necessary, additional HTTP requests. And so on.

<b>Last-Modified</b> is a header that contains the date when the document was last changed. It turned out that the Last-Modified date is not very reliable when trying to figure out if a document has been changed. Sometimes developers will upload all files to the server after fixing something, resetting the Last-Modified date on all files even though the contents only changed on a subset. To accommodate this, most servers also send out an ETag. ETag stands for <b>entity tag</b>, and is a unique identifier that changes solely depending on the content of the file. Most servers actually use a hash function like SHA256 to calculate the ETag.

<b>Cache-Control</b> is exactly what it sounds like. It allows the server to control how and for how long the client will cache the response it received. Cache-Control is a complex beast and has a lot of built-in features. 99% of the time, you only need the “cacheability“ and the “max-age”.

<b>If-Modified-Since</b> permits the server to skip sending the actual content of the document if it hasn’t been changed since the date provided in that header. Is there something similar for ETags? Yes there is! The header is called If-None-Match and does exactly that. If the ETag for the document is still matching the ETag sent in the If-None-Match header, the server won’t send the actual document. Both If-None-Match and If-Modified-Since can be present in the same request, but the ETag takes precedence over the If-Modified-Since, as it is considered more accurate.


### HTTP Verbs :

There are 4 major HTTP verbs : GET, POST, PUT & DELETE.

#### GET

#### POST

#### PUT

#### DELETE

#### HEAD
It lets you get the headers of the request without having to retrive the entire file itself. Such a request can be used to determine if there is enough space on the client to store the data from the request ( Content-Length header) or if the copy of the document in the browser's cache is the latest one or not. That way the browser can skip downloading the file if it has the latest version of the file in its cache. However, sending a HEAD request is generally followed by a subsequent GET request. This can lead to an overhead due to multiple roundtrips. Our aim should be to reduce the number of roundtrips. 

#### OPTIONS

- Lets you know list of verbs that the server currently supports.
This method is important when we talk about CORs.

#### PATCH

### Idempotency of methods
An operation in general (or an HTTP method in particular) is said to be <em>idempotent</em>, if performing the operation multiple times has the same effect on the system, when it was performed the very first time. 
For example, GET, PUT and DELETE are all idempotent; while POST is non-idempotent because each POST requests creates a new entity with a new Id.

### PUT vs PATCH

While PUT requires the sender of the request to specify the entire resource (the fields with changed values, as well as those with the same values) in the request body, PATCH needs the request body to contain only those fields of the entity whose values are to be changed.

### URL( Uniform Resource Locator)

A URL is a formatted string that determines where a particular file is located on the internet. A typical URL looks like this. This is what you typically type in your browser. 
	<pre>
		http://www.ncsu.edu:9000/csc505/handout.pdf
	</pre>


### Parts of the URL String
|-----------------------------------------------------------------------------------------------------------------------|
| 	Part	 	    | 		Meaning										|
|---------------------------|-------------------------------------------------------------------------------------------|
|	http://		    | Protocol used by the client communicate with the server 					|
|	www.ncsu.edu	    | Domain name of the Server 								|
|	:9000		    | Port on which the server is serving the request(default 80, if nothing is specified)      |
|       /csc505/handout.pdf | Relative path of the file of the Server 							|
|			    |												|
|-----------------------------------------------------------------------------------------------------------------------|

#### Notes:  

1. The domain name of the server could also be the public IP of the server that you are making a request.

2. The mapping of the domain name to the public IP of the server is handled by the DNS server. It is the very first request that the server sends out. When the user types in the URL in the browser, a request is first sent to the DNS( Domain Name Server) server that sends back the IP address of the server that corresponds to the domain name. This is then followed by the actual request to the server for the content.

3. Specifying the Port number is optional. If no port number is specified, it is port 80 by default.

4. This can sometimes be followed by an optional set of query parameters. Query Parameters or 'GET' parameters serve as additional filters for the response from the server. The server can make use of this additional information in order to process the response to be sent. Query Paramaters are in the form of key value pairs separated from each other by '&'. 

<pre>e.g. http://www.ncsu.edu:9000/csc505/handout.pdf?semester=spring&year=2015</pre>


#### URI ( Uniform Resource Identifier)
URI is very similar to URLs. But URLs are generally used in reference to web applications while URIs are used with reference to APIs.


# Web Services and Web Applications

# What is an API ?

# REST Architecture

## REST Constraints

# REST vs SOAP

# JAX RS

## JAX RS Annotations

### <pre>@Path</pre> annotation

### <pre>@Produces</pre> annotation

### <pre>@Consumes</pre> annotation

### <pre>@PathParam</pre> annotation

### <pre>@QueryParam</pre> annotation

### <pre>@MatrixParam</pre> annotation

### <pre>@HeaderParam</pre> annotation

### <pre>@CookieParam</pre> annotation

### <pre>@FormParam</pre> annotation

### <pre>@Provider</pre> annotation

### <pre>@Context</pre> annotation

### <pre>@BeanParam</pre> annotation



