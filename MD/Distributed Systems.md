Distributed Systems
================

## Aims of distributed systems
* Performance
	* 0.1s loading time considered immediate
	* Compose web page from multiple distributed sources
	* Load balancing
	* Scaling
* Costs
	* Avoid overhead
	* Light-weight
	* Multi tenancy
	* Scaling
	* Pay as you go
* Availability
	* Redundancy
	* Fail over
	* Load balancing
	* Monitoring
	* Timeouts
* Security
	* Authentication
	* Authorization
	* Encryption
	* Defense in depth
	* Monitoring
	* Backups
	* Planning
* Manageability
	* Monitoring
	* Instrumenting
	* Updates
	* Changes/Migrations
* Scalability
	* Monitor loads
	* Scale up to demand
	* Scale down to reduce costs
	* Bigger changes (shard DB)

## Communication in distributed systems
* Point to Point
* Localized multicast
* Types
	* Request-Response (stateless)
	* WebSockets
	* Streaming
* Text-based
	* Plaintext
	* HTML
	* JSON
	* XML
	* YAML
	* Etc.
* Binary
	* BSON
	* Colfer
	* Hessian
	* Apache Avro

## Security

Problems

* Confidentiality - Keep data from unauthorized access
* Integrity - prevent unauthorized change of data
* Availability - Ability to access data
* Non-reprudiation - Prevent future deniability

Solutions

* Symmetric encryption
	* Single key
	* Fast
	* Key distribution
	* Chaining
	* Integrity
	* Example: AES
	* Chaining
		* The previous block influences the next block -> Repetitions eliminated
		* +Nonce +Counter -> Counter mode (CTR)
* Asymmetric encryption
	* 2 keys
	* One for encryption, one for decryption
	* RSA
	* Rely on prime factorization
	* One has to verify the public key actually corresponds to the person
		* PKI
			* Users trust CA
			* CA issues certificate to site
			* Site present certificate
			* CAs can be hacked
		* PGP / GPG
			* Simple public key as text
			* Often used for e-mails
			* Key exchange parties
		* Personal exchange
		* Blockchain
			* BTC wallet is a private key
			* Public key is identifier
		* Hashing
			* One-way encryption
			* SHA512, ARGON
			* **DO NOT USE:** MD5, SHA1
	* OAuth
		* Identity provider controls all identities
		* Easy for the user
		* `Login with google` button works that way
	* Secure Remote Password
		* Store a hash of the password and salt
		* Prove knowledge of password using DH
		* Produce session key
		* No plaintext password revealed to the server
	* Trusted timestamping
		* Trusted third party signs the timestamp
	* Key splitting
		* N of M systems
		* Calculate M keys based on the original
		* N of them needed to get the original secret
	* Cryptography -- easy on the surface, difficult when you dig down.
		* Small mistakes can compromise security
		* **Stick to existing solutions**

### Distribution transparency

> **Transparency** is the idea of hiding certain information, in order to make it look as though the distributed system was one unified whole.

* Access
* Location
* Migration
* Relocation
* Replication
* Concurrency
* Failure

### Openness

* Using standard syntax and semantics
* Interfaces -- IDL
* Interface semantics
* Interoperability
* Portability
* Extensiblity

### Beginner assumptions

* Network is reliable
* Network is secure
* Network is homogeneous
* The topology does not change
* Latency is zero
* Bandwidth is infinite
* Transport cost is zero
* There is one admin/domain 

### Virtualization

* Runs the program in a specific environment different from the environment outside the Virtualization Manager
* Types
	* Paravirtualization (e.g. JVM)
	* Bare-metal hypervisor (e.g. VMWare)
	* Hosted hypervisor (e.g. VirtualBox)
* Separate privileged calls from unprivileged ones
* Solutions
	* Emulate all instructions
	* Warp nonprivileged instructions to divert control to the VMMs
	* Paravirtualization
* XaaS
	* Infrastructure as a Service
	* Platform as a Service
	* Software as a Service

### Networked UI

* X-window
	* Each application is a client to the X-server
	* They use the X-protocol to communicate with the X-server
	* The X-server displays the image on the terminal

### Server architecture

* Iterative vs Concurrent servers
	* Iterative server
		* The server goes through each request one-by-one
	* Concurrent servers
		* The server creates a separate thread for each process
* Stateful vs Stateless servers
	* Stateful servers
		* Keeps track of client
		* Efficient
		* Fragile
	* Stateless server
		* Does not keep track of client
		* Inefficiencies
		* Robust
	* Distributed systems
		* Entry system
		* Load balancing
		* Processing servers
		* Database servers
