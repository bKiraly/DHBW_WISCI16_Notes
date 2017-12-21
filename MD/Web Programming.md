Web Programming
===============

## Web 2.0

### Paradigm

* Internet as a *platform*
* Cater to niches

### The long tail

* Most of the traffic on the internet is *niche* traffic
* Most sales come from unpopular products

### Technologies Enabling Web 2.0

* AJAX
* REST
* APIs
* etc.

## Sockets

TCP and UDP (see Communications Systems)

### Streams

* Streams break data up into elements
* These elements are transmitted and read by by another bit of code

## Web server

* Gets source from files
* Is on the internet
* Uses HTTP(S)

## TLS

* Predecessor: SSL
* Used for HTTPS
* Cipher negotiation
* Optional: server checks client certificate
* Symmetric encryption

### MitMA

* Man in the Middle Attack
* The attacker inpersonates the server
* The clients sees an invalid certificate or a self-signed certificate

## Service Oriented Architecture

* Microservices
* Small applications that do different things
* Enabling platform- and language independent use and reuse
* Used by applications and other services
* Independence from the concrete implementation
* Legacy applications can be broken down into services

### Characteristics

* Standards
* Security
* Simplicity
* Distribution
* Loose coupling
* Service delivery
* Process oriented

### Web services

* Services on the web
* Components
	* SOAP (Simple Object Access Protocol) -> XML
	* WSDL (Web Service Description Language) -> XML
	* UDDI (Universal Description, Discovery and Integration protocol)

### Representational State Transfer

* Architectural style
* Defined in 2000 by Roy Fielding
* RESTful = meets the requirements of the REST paradigm

#### Resources vs Documents

* Resources can be identified by a URI
* Resource can be represented in different ways
* Resources have a uniform interface
* All actions can be represented by a set of operations
* Concrete semantics must be represented by generic operations

####REST details

* Requests all specific information
* Idempotency
	* The same request always leads to the same result
	* Same destination URI, same method, same data

#### Requests on HTTP

* GET request
	* Reads information about the resource
	* `GET <URI>`
* POST request
	* Changes the resource
	* `POST <URI>\r\n\r\n<DATA>`
* PUT
	* New representation of an existing resource
	* `PUT <URI>\r\n\r\n<DATA>`
* DELETE
	* Removes a resource
	* `DELETE <URI>`

### Sessions

#### Session

* Store ID data on the client
* Store mapping on the server
* Two methods

#### Cookies

* Allow web pages to store key-value pairs locally
* Automatically transferred to the server with each request
* Session cookies are only valid for the session
* Persistent cookies expire at a specific date or after a specific amount of time
* Cookies can be blocked

#### Web Storage

* Allows web pages to store KV pairs
* Storage limits are higher (5MB per origin)
* Data is **not** automatically sent every request
* Web pages can request it any time
* Separate storage area for each origin
* Web Storage API provides two different mechanism
	* window.sessoinStorage
	* window.localStorage

### HTML

#### Structure of an HTML document

```
<!DOCTYPE html>
<html>
	<title>My HTML Page</title>
	<body>
		<h1>My page</h1>
		<p>Hi there</p>
	</body>
</html>
```

#### Structure of an HTML tag

`<tagname attribute=value>`
eg.
`<img src=sajt.png>`

#### Useful tags and attributes

```
<h1>Heading of first level (typically with a large font size)</h1>
<h2>Heading of second level (typically with a medium font size)</h2>
<a href="index.html" title="Go to start page" target="_self">Opening in same window</a>
<a href="index.html" title="Go to start page" target="_blank">Opening in new window</a><imgsrc="example.png" alt="Alternative text" width="10" height="14“ />
<br/> <!--This is a comment, explaining that <br/> = break makes a new line -->
<b>Bold text</b> <i>Italic text</i> <strong>Strong text</strong> <em>emphasized text</em>
```