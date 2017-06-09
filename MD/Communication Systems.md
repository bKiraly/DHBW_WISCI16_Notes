Communication Systems
========================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## Literature
Tennenbaum - Computer networks (up until network security chapter)

[This slideshow on the internet](http://slideplayer.com/slide/3607059/) among others apparently

## Introduction

### Definition of Computer Networks

> A **computer network** is a collection of autonomous computers. It is used to share resources across different computers.

#### Uses of Computer networks

* Business Applications
	* Generally use the Client-Server model
* Home Applications
	* Consumption and users
	* Some P2P services
* Mobile Users
	* Wireless networks

Problems: Social issues (lack of connectivity)

* Net neutrality
* Content ownership
* Anonymity
* Privacy
* Illegal activity

### Network hardware

Network classification by scale:

* Personal AN (Area Network)
	* Devices connected to a single device
* Local AN
	* A single building
	* 802
* Metropolitan AN
	* Run by a cable provider
* Wide AN
	* Run across a country
* The internet

### Network Software

#### Protocol layers

> The **protocol layering** method is the main method for structuring the network. Each protocol communicates with its peer using the protocol below.  The lower-level layers are accessed via an *interface*. The lowest layer is the physical medium.

#####Header and Trailer Information
> **Header information** is extra information added to the beginning of the message by each layer before passing it on to the next. This header information is treated as part of the data by the next layer. **Trailer information** behaves in the same way as headers, but is appended to the end of the message. It is generally used for checking the correctness of the message

##### Splitting messages
> If a message is too large to be transmitted in the lower layer, the current layer may **split the message**.

#### Design Issues for the Layers

* Reliability despite failures
* Network growth and evolution
* Allocation of resources
* Security

#### Connection-oriented vs Connectionless
> A **connection oriented** protocol must be set up for the ongoing use. A **connectionless** protocol does not have a setup.

#### Service primitive
> **Service primitives** are basic instructions implemented in the layer provided by the layer below.


### Reference Models

#### OSI Model
> The **OSI Model** is an international standard for connecting two hosts using seven layers.

* Application
	* Functions to the user
* Presentation
	* Converts different representations
* Session
	* Manages sessions
* Transport
	* Transports the data to its specified destination
* Network
	* Send packets over multiple links (finds next link)
* Data link
	* Combines to data into frames (gives data a beginning and an end)
* Physical
	* Electric voltages

#### TCP-IP model

* Application
	* ex. HTML
* Transport
	* TCP or UDP
* Internet
	* IP, ICMP (Internet Control Messaging Protocol)
* Link
	* DSL
	* 802

#### Model used in this course

* Application
* Transport
* Network
* Link
* Physical

#### Critique of OSI and TCP-IP

OSI

* Influential, clear concepts
* Models, protocols and adoption are hindered by complexity

TCP/IP

* Widely adopted
* Weak model derived after the fact

### Examples of Networks

#### The Internet

* ARPANET (US military network, robust against nuclear attacks)
* NSFNET (High-speed backbones between central locations)
* Modern Internet
	* ISPs maintain networks
	* Route traffic between each other using IXPs
	* Inside networks routers switch packets
	* Between networks business agreements regulate data exchange
	* Customers connect at the edge
	* Data centers concentrate many servers
	* Most traffic is content from data centers
	* Architecture continues to evolve

#### 3G Mobile Networks

* Divided into cells
* Each cell is covered by a base-station
* The phone is connected to the base-station
* Upon passing from one cell to another, you get handed over to the next base station
* RNC connects the base stations

#### Wireless LAN

* Defined by the 802.11 standard
* Access points serve the client
* Multiple paths
* Interference is a problem (Carrier Sense Multiple Access designs are used)

#### Network Standardization
Standards define what is needed for *interoperability*

| Body	| Area		| Examples		|
|-------|---------------|-----------------------|
| ITU	| Telecom	| ADSL, H.264		|
| IEEE	| Communication	| 802 (Ethernet)	|
| IETF	| Internet	| RFC 2616, HTTP/1.1	|
| W3C	| Web		| HTML5, CSS		|

#### Metric units

* Regular metric prefixes
* Powers of 10 for rates, powers of 2 for storage
* B for bytes, b for bits


## The Physical Layer

### Theoretical Basis for Data Communications

### Guided Transmission Media

#### Reality check
Storage media

* Send data on tape/disk
* Pingtime is high

#### Wires
##### Twisted pairs

* Twisted to cancel interference
* Most common
* Shielded
* Links
	* Full-duplex
		* Transmission both ways
	* Half-duplex
		* Both directions, but not at the same time
	* Simplex
		* Only one direction

##### Coaxial cable

* Also common
* Two conductors are outside and inside
* Higher bandwidths

##### Power lines

* Encode the signal in the power
* Prone to interference

#### Fiber cables

* Cover longer distances
* Higher transmission speeds

### Wireless Transmission

#### Electromagnetic spectrum

There are a limited number of frequencies that can be used to communicate simultaneously without interfering with each other.

![Electromagnetic frequencies](https://upload.wikimedia.org/wikipedia/commons/c/cf/EM_Spectrum_Properties_edit.svg)

![Frequency usage](https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/United_States_Frequency_Allocations_Chart_2011_-_The_Radio_Spectrum.pdf/page1-1200px-United_States_Frequency_Allocations_Chart_2011_-_The_Radio_Spectrum.pdf.jpg)

##### Unallocated frequency bands (ISM)

2.4 GHz, 5 GHz

![ISM bands](http://www.peterpaulengelen.com/wp-content/uploads/2013/11/Wireless-radio.jpg)

#### Radio transmission

Radio signals penetrate buildings, but over long distances the curvature of the earth gets in the way
Solution: HF radio waves can be bounced off the ionosphere to reach over-the-horizon listeners

#### Microwave transmission

Different paths, that might interfere with each other.

#### Light transmission

Non-fiber light transmissions
Lasers-Photodetectors can be used for high-bandwidth transfer
Disturbances in the air cause problems with the transmission

#### Wireless vs Wired

* Wireless
	* Easy and inexpensive
	* Naturally supports mobility
	* Naturally supports broadcast
	* Transmissions interfere and must be managed
	* Signal strengths and data rates degrade depending on distance
* Wired
	* Easy to engineer with fixed data rate point-to-point links
	* Can be relatively expensive
	* Doesn't support mobility or broadcast

### Communication Satellites

#### Types of Satellites

##### Geostationary satellites (GEO)

Latency: 270ms
Satellites for global coverage: 3
Altitude: 35 000km

VSAT computers

##### Low-Earth Orbit satellites (LEO)

Latency: 1-7ms
Satellites needed for global coverage: 50
Altitude: <5 000km

Iridium service

##### Satellite vs Fiber

* Satellite
	* Can be set-up anywhere
	* Covers large regions
	* Bandwidth is limited
* Fiber
	* Large bandwidth
	* Needs installation

### Public Switched Telephone Network (PSTN)

#### Structure of the telephone systemű

Hierarchical system carrying voice calls:

* Local loops, mostly analog twisted pair
* Trunks, digital fiber optics
* Switching offices that move calls around trunks

#### Politics of telephones

#### Local loop (ADSL, FttH)

##### Modems
Rates: <56kb/s
Uses analog voice to transmit data

##### Dynamic Subscriber Line
Uses frequencies that are unused by the voice communication
A(Asymmetric) DSL: 12Mb/s
VDSL: 100 Mb/s

##### Fiber to the Home
Fiberoptic cables
High bandwidth
Expensive
Passive, no amplifiers, one wavelength among many houses

#### Switching
PSTN uses *circuit switching*, the internet uses *packet switching*.
> **Circuit switching** describes the concept of directly connecting two hosts on a single circuit

&nbsp;
> **Packet switching** describes the concept of the data being broken up into different *packets*, that take different routes to the destination

* Circuit switching requires an initial setup and connection time, as the host looks for an outgoing trunk
* Packet switching treats data independently, suffering queuing delay on the way

### Mobile Telephone Systems
#### 1G, analog voice

* AMPS
#### 2G, analog 

* GSM (Global System for Mobile communications)

#### 3G, digital voice and data

* UTMS

#### 4G, digital data including voice

* LTE

#### Cellular mobile systems

* All based on spatially separated cells
* Devices switch between these cells using *handoffs*
* Frequencies are reused across non-adjacent cells


**The prof skipped a whole bunch of stuff here, see the slides for this one ¯\\_(ツ)_/¯**

### Cable television
#### Internet over Cable

* Many customers share the same line
* Higher bandwidth
* The frequencies are mostly used for downstream data (Asymmetric data rates)

#### Cable modem
* Physical layer DOCSYS standard (?)

#### Cable vs DSL

* Cable
	* Uses coaxial cable to customers (Bandwidth)
	* Data is broadcast to all customers
	* Bandwidth is shared between all customers
* DSL
	* Bandwidth dedicated to each customer
	* Point-to-Point link does not broadcast data
	* Twisted pair to customers $\rightarrow$ lower bandwidth


### Digital Modulation and Multiplexing

**I'm pretty sure we skipped this one as well**

## The Data Link Layer

> The **data link layer** delivers *frames* of information across a single link. It handles transmission errors, and connection across a link.

#### Frames

> **Frames** are chunks of data of specific length with a header and a footer.

#### Services

* Unacknowledged connectionless service
	* Frame is sent without any connection and error recovery
	* Ethernet
* Acknowledgement connectionless service
	* Message is acknowledged
	* 802.11
* Acknowledged connection oriented service

#### Framing methods

##### Byte count

Start of the frame has the number of bytes in the frame
Simple, but difficult to resynchronize after an error

##### Flag bytes and byte stuffing

Special *flag* byte delimits the frames, the same byte pattern in message must be *escaped*.
Longer, but easily resynchronized after error.

##### Flag bits and bit stuffing

Stuffing is done on a bit level

* Frame flag has six consecutive ones
* On transmit after 5 ones of data, a zero is added
* On receive the zero is discarded

##### Physical layer violations

Changes in the specification on a physical level (different voltage, etc.)

### Error- Detection and Correction

Repairs frames received with an error

* Requires errors to be received
* Typically retransmit the unacknowledged messages
* Timer protects against lost acknowledgements

Detecting errors and retransmission is paramount

#### Flow control

> **Flow control** prevents fast sender from out-pacing the slow receiver.

* Receiver gives feedback on the data it can accept
* Rare in Link layer, as Network Interface Cards (NICs) run at "wire speed"
	* Receiver can take data as fast as it can be sent

Flow control is mostly used on the Transport layers

#### Error Detection vs Error correction

> **Error codes** add structured redundancy to data sot that errors can be detected and corrected

* Error correction codes (we skip those as well ¯\\_(ツ)_/¯)
	* Hamming codes
	* Binary convolutional codes
	* Reed-Solomon and Low-Density Parity Check codes
		* Mathematically complex
* Error detection codes
	* Parity
		* XOR all bits, add result to the end
		* Detection checks if last bit is XOR of all previous ones
	* Checksums
		* Treats message as N-bit words, and adds N check bits that are modulo $2^n$ szn if the words
	* Cyclic Redundancy Codes (CRC)
		* Adds bits to the transmitted frame
		* The data is treated as a binary polynomial, and divided by another, resulting in a remainder
		* Detection does the CRC again, and compares with the transmitted CRC code
		* Used by ethernet
		* Can detect all double-bit errors
		* Not susceptible to symmetric errors

**We skipped some stuff here too...**

### Link Layer Environment

Driver and NIC implement the Data-Link layer

**Skipped some stuff again...**

####Utopian simplex protocol

* An optimistic protocol (p1) to get us started
	* Assumes no errors, and receiver as fast as sender
	* Considers one-way data transfer
	* Comments are additions for flow control

``` c
void sender1(void)
{
	frame s;
	packet buffer;
	//event.type event;
	while(true){
		from.network.layer(&buffer);
		s.info = buffer;
		to.physical.layer(&s);
		//wait.for.event(&event);
	}
}
```

``` c
void receiver1(void)
{
	frame r;
	//frame s;
	Event.type event;
	while(true){
		wait.for.event(&event);
		from.physical.layer(&r);
		to.network.layer(&r.info);
		//to.physical.layer(&s);
	}
}
```

#### Sliding window concept

* Sender maintains window of frames
	* Only sends if ack is received
* Receiver acknowledges when it's done processing


Larger windows enable *pipelining* for efficient ling use

* Stop and wait is inefficient
* Best window depends on bandwidth delay
* Wand w > 2BD+1 to ensure high link utilization

Pipelining leads to different choices for errors/buffering


## Medium Access Control Sublayer

> The **Medium Access Control** (MAC) sublayer decides who sends next on a multi-access link. Important for LAN.

### Channel Allocation Problem

* For fixed channel and traffic N users
	* Divide up bandwidth using FTM, TDM, CDMA, etc.
	* This is static allocation (ex. FM radio)
* This static allocation is ill-suited for bursty traffic
	* Allocations will sometimes go unused

> **Dynamic allocation** gives the channel to a user when they need it. Potentially N times as efficient for N users.

Schemes vary with assumptions

* Independent traffic
	* Often not a good model, but permits analysis
* Single channel
	* No external way to coordinate senders
* Observable collisions
	* Needed for reliability; mechanisms vary
* Continuous or slotted time
	* Slotting may improve performance
* Carrier sense
	* The sender is aware of the availability of the channel
	* Can improve performance if available

#### Multiple Access Protocols

##### ALOHA

* Transmit frames whenever they have data
* Retry after a random time for collisions
* Collision happens, if frames are transmitted during vulnerable times
* Slotted ALOHA gains higher efficiency by slotting the times

##### CSMA

* Improvement: Sensing channel
	* User doesn't send if there is something going on
* Variations on what to do if the channel is busy
	* I-presistent (greedy) sebds as soon as idle
	* Nonpresistent waist for a random time
	* Sends with p probability
* Used in todays LAN

![Graphs comparing different protocols at different traffic levels](http://www.pling.org.uk/cs/ndsimg/csmautilisation.png)

###### Collision detection
CSMA/CD improvement detects/aborts collisions
$\rightarrow$ reduced contention times improve performance

##### Collision-free protocols

* Collision-free protocols avoid collisions entirely
	* Senders must know when it's their turn to send
* Token rings
	* Station with token may send a frame before passing
	* Idea can be used without a ring (ex. token bus)

##### Limited-contention protocols
** We skipped this too...**

##### Wireless LAN protocols

###### Hidden terminals

* The signal range may cause one of the hosts to not detect the collision, while the message is still lost to the recipient

###### Exposed terminals

* The host may detect a collision, even when the interference is outside the signal range for the receiver

###### MACA

* Grants access for A to send to B
	* A sends RTS to B; B replies with CTS
	* A can send with exposed but not hidden terminals


### Ethernet

#### Classic Ethernet

* One coaxial cable with all hosts attached
	* Up to 10 Mbps, with Manchester encoding
	* Hosts ran the classic Ethernet protocol for access
	* A transceiver sends the data to the coax
	* Every participant sees every message, and decides based on content if it's for them
	* Later coax was replaced by antenna cables
	* Very unreliable

![Classic Ethernet topology](http://slideplayer.com/slide/4195093/14/images/91/Classic+Ethernet+Physical+Layer.jpg)

Addressing scheme

* MAC protocol as CSMA/CD (see above)
* Random delay (backoff) after collision is computed using BEP (Binary Exponential backoff)
* Frame format is still used in modern Ethernet (IEEE 802.3)

![Ethernet packet layout](http://i.cloud.opensystemsmedia.com/i__src348cc73403da619e46bf4af301f8b441_par1a3c1eb4506a5f22486e2677b9cb9c0d.jpeg)

| Field			| Size	|
|-----------------------|-------|
|Preamble (opt)		| 8	|
|SoF (opt)		| ^	|
|Destination address	| 6 	|
|Source address		| 6	|
|Length			| 2	|
|Data			| 0-1500|
|Pad (opt)		| 0-46	|
|Checksum (opt)		| 4	|

![Wireshark capture of an Ethernet package](https://networklessons.com/wp-content/uploads/2014/02/wireshark-ip-tcp-ethernet-bytes-length.png)

Collisions can arrive in $2\tau$ (twice the time for the message to arrive). Message size should be chosen accordingly.

Ethernet is efficient with large frames even with many senders. Smaller frames are worse.

#### Switched / Fast Ethernet

* Hubs wire lines into a single CSMA/CD domain (star topology)
	* Every packet is *still* sent to all connected hosts
* Switches isolate each port to a separate domain
	* Much greater throughput for multiple ports
	* No need for CSMA/CD with duplex lines
	* They only send packets to the intended recipient
	* Broadcast address is also available, the destination address is FF:FF:FF:FF:FF:FF
* 10 to 100 Mbps, mostly twisted pair Cat5 cables
* Fiberoptical sub-protocol (up to 2km cable lengths)

#### Gigabit / 10 Gigabit Ethernet

Switched Gigabit Ethernet is now ubiquitous, full-duplex lines between computers/switches
Same type of cabling as Fast Ethernet, additional multi-km fiber cables exist for these networks
* CAT 6a UTP cable
* 40/100 Gbps Ethernet is under development

### Data Link Layer Switching

#### Bridges

> **Bridges** are auxiliary switches or hubs that concentrate network traffic on single lines before attaching to the main switch

#### Learning Bridges

> **Bridge** operates as a switch, and *"learn"* which ports are associated with which addresses.

#### Spanning tree problem

**Skipped**

#### Network interconnecting devices

* Physical layer: Repeater, Hub
* Data Link Layer: Bridge, Switch
* Network Layer: Router
* Transport Layer: Transport Gateway
* Application Layer: Application Gateway

#### Virtual LAN (VALN)

> **VLAN** splits a physical LAN into multiple logical LANs to ease management, ports are color-coded according to their VLAN. VLAN header is added to the Frame to identify the VLAN.

Described in IEEE 802.1Q

## Network Layer

> The **Network Layer** is responsible for delivering packets between endpoints over multiple links.

### Design and issues

#### Store and forward packet switching

*Hosts* send *packets* into the network that are *stored* and forwarded by routers.

Packets are forwarded based on the *routing table*, not all packets take the same path.

#### Virtual circuit tags

> The **Virtual circuit tag** determines the packets route before sending, it is therefore faster, but less flexible than datagram subnets

Advantages and disadvantages of virtual circuit networks

![Advantages and disadvantages](http://computing.dcu.ie/~humphrys/Notes/Networks/tanenbaum/5-04.jpg)

### Routing algorithms

> **Routing** is the process of discovering network paths

* Model a network graph of nodes and links
* Optimize for fairness or efficiency
* Update on changes (failures)
* *Forwarding* is sending packets along a path

#### The optimality principle

Each portion of the best path is also a best path (Best might mean fewest hops)
> The union of all best paths is called a **sink tree**

#### Shortest path algorithms

##### Dijkstra's algorithm

* Each link is assigned a non-negative weight/distance
* Shortest path is the one with the lowest total weight
* Using weights of 1 gives the fewest hops (since each hop costs 1)

##### Algorithm

* Start with sink, set all distances to infinity
* When a node is reached via some path from the reachable nodes (ones with non infinite distances) and no shorter path already exists
	* Set the distance of the node the distance of the intermediary + the distance from the intermediary
	* Set the path-to value of the node to the path-to value of the node to the intermediary node
* Repeat until all reachable nodes are mapped

![Dijkstra's algorithm explained](http://cs.smith.edu/~streinu/Teaching/Courses/274/Spring98/Projects/Philip/fp/dijkstra.jpg)

See this video for a more detailed explanation on Dijkstra's algorithm.
<center><iframe width="560" height="315" src="https://www.youtube.com/embed/GazC3A4OQTE" frameborder="0" allowfullscreen></iframe></center>

### Flooding

>***Flooding** is a simple method to send a packet to all network nodes. Each node floods a new packet received on an incoming link to all other links. Nodes keep track of flood packets, and employ hop limits to prevent loops.

#### Distance Vector Routing

> **Distance vector** is a distributed routing algorithm, that splits the shortest path calculation between nodes.

##### The Algorithm

* Each node knows the distance between itself and its neighboring nodes
* Each node advertises distances to all known nodes
* Each node updates the distance from all connected nodes based on the information from other nodes

![DV routing](https://image.slidesharecdn.com/distancevectorrouting-140108002558-phpapp02/95/distance-vector-routing-2-638.jpg?cb=1395479151)

##### The Count-to-Infinity problem

Failures can cause DV to "count to infinity" while seeking a path to an unreachable node, leading of a slow propagation of increasing access times

![Count to infinity example](https://qph.ec.quoracdn.net/main-qimg-461f25bd2385ac40c92f4b1a7b1e867b-c)

#### Hierarchical routing

> The **hierarchical routing** concept describes a network *hierarchy*, whereby not all nodes are connected to all other nodes, instead they are hierarchically nested in *subnets*. Only the destination *subnet* needs to be stored and computed, thus 

Hierarchical routing reduces the work of route computation, but may result in slightly longer path.

![Hierarchical routing](http://s.hswstatic.com/gif/routing-algorithm10.gif)

#### Routing for Mobile Hosts

* Mobile hosts can be reached via a home agent (proxy)
	* Fixed home agent tunnels packets to the mobile host and optimizes route based on response
	* The outside host uses a regular routing protocol

#### Traffic-Aware Routing

Choose routes depending on traffic, not just topology. (Avoid overloading lines)

### Quality of Service (QoS)

#### Application Requirements

Different applications have different network requirements, all should get what they need.

![](http://www.networkinginfoblog.com/contentsimages/Requirements%20of%20selected%20network%20applications.JPG)

Network provides different QoS to different services, for example a constant bitrate to telephony.

#### Traffic shaping

Traffic shaping regulates the average rate of data that enters the network

Token/Leaky bucket limits both average rate (R) and short-term burst (B) of traffic.

![Leaky bucket](http://ecomputernotes.com/images/Leaky-Bucket.jpg)

**Skipped stuff**

#### Packets scheduling

FIFO or prioritize (Round Robin', Fair queuing (WFQ))

**Skipped stuff***

### Internetworking

> **Internetworking** connects multiple different networks to a single, larger networks

#### Differences between networks

Differences between networks (architecture, implemented protocols, offered services, packet sizes, etc.) make internetworking complicated

#### Connecting networks

Different networks use the same network layer.

![Network layer internetworking](http://images.slideplayer.com/13/3607059/slides/slide_57.jpg)

#### Tunneling

> **Tunneling** connects two network through a middle one (packets are encapsulated over the middle)

![Tunneling](http://player.slideplayer.com/13/3607059/data/images/img50.jpg)

#### Packet fragmentation

> **Packet fragmentation** refers to the process of breaking up a packet into smaller packets to conform with a networks frame size requirements.

The start offset is the place of the message that is being sent.

> **Max Transmission Unit (MTU)** analyzes the network to get the maximal size packets that can be transmitted over the network.

### Network layer on the Internet

#### IPv4

IP has been shaped by the following guiding principles

* Make sure it works
* Keep it simple
* Make it clear
* Exploit modularity
* Expect heterogenity
* Avoid static options and parameters
* Look for good design
* Strict sending, tolerant receiving
* Scalability
* Performance and cost

#### IP Addresses

IPv4 header carries the following data:

![IPv4](http://static.thegeekstuff.com/wp-content/uploads/2012/03/ip-header-2.png)

* Version (v4 or v6)
* IHL (Header length)
* Differentiated services
* Total length (message length)
* ID
* Flags (Fragmentation flags)
* Fragment offset
* Time To Live (hop count)
* Protocol (UDP / TCP)
* Header checksum
* Source IP
* Destination IP
* Options / Padding

#### IPv6
#### Internet Control Protocols