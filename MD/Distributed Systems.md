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
