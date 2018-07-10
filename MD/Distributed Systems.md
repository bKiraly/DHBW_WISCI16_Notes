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

### Messaging

* Persistent vs transient messaging
* Synchronous vs asynchronous messaging

### RPCs

* Remote procedure calls
* Functions on servers
* Encoding negotiation
* Async RPCs -> callback called when the server is done

### MPI

* Used in supercomputers
* Specific cases

### Message-oriented middleware

* Queue managers
* Message brokers
	* Transform and relay messages based on source and destination addresses and formats
* Multicast (Application level)
	* Link stress
	* Stretch
* Epidemic protocols
	* Anti-entropy
	* Rumor spreading

### RESTful services

* Usually via HTTP(S)
* Messages can be XML, JSON, etc.
* Based on URIs
* Resources
* CRUD operations

CRUD:
-Create 
-Run
-Update
-Delete
Client-Server architecture
-Seperating concers
    -UI from processing from data storage
    -Better scalability
    -Better support for migration, update, replace
    
Statelessness
* No client context stored in server between requests
    * State stored in the client
    * Can be also in the underlying DB
    * Client sends a request when changing state
Cacheability: Messages have to define wheter they are cacheable or not -> Perfomance improvements
Layered system:
* Client cannot tell if it is talking to:
    * Gateway
    * Authentification server
    * Load balancer
    * App server
Code on demand:
* Server can extend client by providing code
Uniform interface:
* Resource identification in request
    * Resource identified directly in the URI
    * Resource representation seperate from internal
* Resource manipulation through representation
    * Resource representation has enough info to manipulate it in the server
* Self-descriptive messages
    * Each messages has enough info to process it
* Hypermedia As The Engine Of Application State HATEOAS

#### REST Maturity levels
0. Swamp of POX
	* Communicate over HTTP
1. Resources
	* URI path already correct
2. Verbs
	* URI Parameters now correct
3. HATEOAS
	* Discoverability
	* Return all resources needed for future replies

#### Advantages of REST
* Simple service
* No state mismatch
* Easy load balancing
* Easy service comparison
* Correct verbs make service clearer

#### Naming things
* Pure name -- random string
* Identifier -- A name with a  specific property
* Flat naming
* Broadcasting
* ARP
* Forwarding pointer
* Hierarchical locations services
	* Create hierarchies based on geographical data
	* Keyspaces create trees
* Structured naming
	* Each level defines its namespace
	* Attach attributes to any node
	* DNS
	* NFS file name
	* Phone number
	* IP address
* Links
	* Hard link -- Point to another node
	* Soft link -- Contain the name of another node
* Mounting
* Foreign namespaces can be mounted in a node on the root namespace
* Name spaces can be split among multiple machines in a distributed way
* DNS name resolution (see Communication Systems)
* UUIDs and GUIDs
	* Practically unique
	* No central coordination
	* 128-bit identifiers
	* RFC 4122 defines uniform resource name

### Coordination

* Clock coordination
	* NTP
	* UTC
	* Reference broadcast synchronization
	* Happened-before relationships
* Logical locks
	* Lamports clocks
	* Vector locks
* Mutual exclusion
	* Lamports clocks for mutual exclusion
	* Permission based
		* Coordinator decides who gets the lock
	* Token based
		* Token-ring overlay network
	* Mutual exclusion Ricart & Agrawala
	* Decentralized algorithms
* Election algorithms
	* Find coordinators
	* All processes have unique IDs
	* All processes know of all other processes in the system
	* Election means identifying if the process with the highest ID is up
	* Elections in ring systems
		* Send a message on the ring with the ID
		* It goes around, and each node adds its ID
* Positioning of a node
	* Calculate distance to landmarks
	* GPS


### Replication

* Reasons for replication
	* Reliability
	* Performance

#### Consistency

* Guaranteed consistency
	* Locking
	* Performance problems
	* Sequence locking
* Eventual consistency
	* Relaxed
	* The changes will be replicated to other replicas
	* This is not a locking call
	* Monotonic reads

#### Content distribution

* Propagate notification/invalidation
* Transfer the data
* Propagate the update operation

#### Pull vs push

* Push
	* Server-initiated
* Pull
	* Client initiated poll

#### Replication methods

* Primary based
	* Primary handles all the writes
	* Primary has to sign off on all writes

## Fault tolerance

### Goals
* Partial failure != total failure
* Ideally failure means no degradation
* If degradation is inevitable, it should degrade gracefully
* In the case of catastrophic failure it should fail safely

### Dependability
* Parts of a system may depend on other parts of a system

### Metrics
* Availability
* Reliability
* Safety
* Maintainability


