Macro- and Microeconomics
=======================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

##1-3.

> **Disclaimer**
> This is the beginning of phasing in of my rich text note taking format. Thus these chapters are missing.

## 4. Circular flow model
> **Disclaimer**
> This is the beginning of phasing in of my rich text note taking format. Thus this chapter is incomplete.


$\text{Return on sale} = {\text{Profit} \over \text{Sales}}$

![Circular flow](https://stevenduan.files.wordpress.com/2010/07/circular-flow-model1.gif)
Example
: 
```sequence
Households->Market for products: Consumption = 200
Market for production factors->Households:Wage income = 150
Market for production factors->Households: Profit = 30
Market for production factors->Households: Rent = 20
Market for products->Firms:Sales revenue = 200
Firms->Market for production factors:Wage cost = 150
Firms->Market for production factors:Profit = 30
Firms->Market for production factors:Rent = 20
```
---

## 5. Introduction to National Accounting
### 5.1 Definitions
#### Gross Domestic Product
>**Gross Domestic Product (GDP)** is the *market value* of all *final* *goods and services* produced *within a country* at a *given period of time*. The GDP only includes the products and services produced *legally* on the market.
##### Market value
>The **market value** of a product is the total cost of the product to the customer. It is calculated the following way:
>$$
V_{market} = Cost + Profit + VAT(= \text{Value Added Tax})
$$

Example
: Germany: VAT = 19%
Company price = 100€
Market price = 100*1.19 = 119€
Firm: 100€; Govt: 19€

##### Final goods
>A **final good** is ready for consumption by the *consumer*.
>Opposite: *Intermediary good*: Used for production of other goods

Example
: 
```flow
milk=>condition: Is milk a final good?
drink=>operation: To drink
supermarket=>operation: Sold to consumer - Counts towards GDP
cheese=>operation: To make cheese
factory=>operation: Sold to factory - does not count towards GDP

milk(yes)->drink->supermarket
milk(no)->cheese->factory
```
##### Goods and services
>**Goods** are tangible assets, **services** are intangible assets.

Example
: A cake is a *product*.
An economics lesson is a *service*. 
##### Produced  within a country
>Assets are considered to be **prodcuted within a country**, if and only if their *production* was within the borders of the country, without regards to the seat or residence of the corporation or employee that created the asset.

Example
: An Irish citizen works for a company in Germany. His contributions count towards the GDP of Germany, not to the GDP of Ireland.

##### In a given period of time
>GDP is calculated by the aggregate of all *products and services* over a **given period of time**. The basic period is one quarter. Yearly GDP is calculated by summing up all quarters.

GDP% qoq (Quarter over Quarter)
>**GDP% qoq** describes the relative growth of the GDP compared to the previous quarter. It is calculated using the following formula:
$$
GDP\%_{qoq}(t) = {GDP(t)-GDP(t-1) \over GDP(t-1)}
$$

GDP% yoy (Year over Year)
>**GDP% yoy** describes the relative growth of the GDP compared to the same quarter of the previous year. It is calculated using the following formula:
$$
GDP\%_{yoy} (t) = {GDP(t_n)-GDP(t-4) \over GDP(t-4)}
$$

Annualized quarterly growth rate
>The **annualized quarterly growth rate** describes the annual growth assuming unchanging quarterly growth rates. It is calculated using the following formula:
$$
GDP\%_{annualized}(t) = (1+GDP\%_{qoq}(t))^4
$$

Detailed statistical reports usually report all three,  general statistical offices usually report only *yoy* figures.

Conversion from *qoq* to *yoy* figures:
$$
GDP\%_{yoy}(t) = \prod_{k =0}^3(GDP\%_{qoq}(t-k))
$$

Example
: DESTATIS (German Statistical Office) reports all three figures, EUROSTAT reports *yoy* figures.
BEA (Bureau of Economic Analysis) reports *annulized qoq* figures. 

##### Legality
>**Legal goods** are goods that are not produced or sold illegally (i.e. on the black market). Used products are also excluded from the GDP. Inventories increase GDP however.

### 5.2 The components of the GDP
```sequence
Households->Market for products: (2) Consumption
Market for production factors->Households:(3) Household income
Market for products->Firms:(1) Company revenue
Firms->Market for production factors:(4) Costs + Profits
```
1. Output approach: Sum of all gross value added of all firms $\rightarrow$ avoids multiple counting
    Formally: $GDP = \sum(\text{VA}_k)\quad+ T_{ind} - S_b$
2. Expenditure approach: GDP = Consumption + Investment + Government expenditure + Net Exports
    Formally: $GDP = C+I+G+Ex-In$
3. Income approach: GDP = Labor income + Capital income
    Formally: $GDP = I + C \quad +T_{ind} - S_b + T_{prod/imp} - S_{prod/imp}$
4. Costs+Profits: values are hard to get; rarely used
##### Consumption
>**Consumption** constitutes all spending by *households*, with the exception of purchases of new housing.
##### Investment
>A product counts as an **investment** if it costs more than 400€ and stays in the company for over a year. Investments in the company need to be *depreciated*. Decrease in inventories is considered *negative investment* and thus reduces GDP.
##### Government purchases
>**Government purchases** are the spending on goods and services by the local and central governments, except for government transfers (e.g. social benefits).
##### GDP per capita
>GDP per capita describes the value of the *goods and services* created by the average individual. It is calculated the following way:
>$\text{GDP per capita} = {GDP \over Population}$

One additional account: Statistical discrepancies

### The art of economic forecasting
> A **forecast** is an extrapolation of the general trends of the change of specific economic economic values
> In general the components of the *expenditure approach* are measured, their growth rates estimated, and their weighted average calculated. The following formulas is used to calculate the forecast of the next year, where the current year is n:
> $$
W_a = {a_n \over GDP_n}\\
GDP\%_{n+1} = W_C C\%_{n+1} + W_II\%_{n+1} + W_G G\%_{n+1} + W_{Ex} Ex\%_{n+1} - W_{In}In\%_{n+1}
$$

#### Forecasting Consumption
> **Consumption** is estimated using *Consumer Confidence Surveys*. People are asked to estimate the change in their economic state over the next six months.

Germany $\rightarrow$ Consumer Confidence Index measured by GfK - Gemeinschaft für Konsumforschung (ger. Association for Consumption Research) Nümberg

#### Forecasting Investment
> **Investment** is estimated using a *Survey of Business Climate*. Companies are asked to estimate the change in their economic state over the next six months. (at least 8 000 responses)

Germany $\rightarrow$ Business Climate Index measured by the Institute of Munich

#### Forecasting Government expenditure
>**Government expenditure** is assessed by sourcing the *government budget*.

#### Forecasting Net Exports
> **Net exports** are estimated based on the *exchange rate* of the currency of the country, as well as the *growth rate of the world economy*.

### 5.3 Other measures
#### Gross National Product (GNP)
> **Gross National Product (GNP)**  is the market value of all final goods and services produced *by the residents of the country* at a given period of time.
##### Resident
> A **resident** is a person who stays within the country at least 183 days of a year.
##### Calculating GNP from GDP
>The **GNP can be calculated from the GDP** in the following way: GNP is equal to the GDP plus the income of citizens of the country working abroad, minus the income foreign citizens working in in the country.

Example
: Decide which of the following counts towards the German GDP and/or GNP respectively:

 * German workers create a product in Germany (GDP and GNP)
 * German workers produce a product abroad (GNP not GDP)
 * French workers produce a product in Germany (GDP not GNP)
 * Chinese workers produce a product in China (none)

#### Net National Product (NNP)
> The **Net National Product** is a metric of the products of an economy that takes into account *depreciation*.
It is described by this formula:
$$
NNP = GNP - Dep
$$

#### National Income (NI)
> **National Income (NI)** (also known as *Net National Income (NNI)*) is a metric that adjusts the value of NNP based on *indirect taxes* ($T_{ind}$) and *business subsidies* ($S_b$). It is calculated using the following formula:
> $$
NI = NNP - T_{ind} + S_b
$$

Example
: VAT
Subsidies on producing renewable energy
Subsidies on agricultural products
#### Gross National Income (GNI)
>The **Gross National Income (GNI)** is the *Net National Income* without adjusting for the depreciation. It is calculated the following way:
$$
GNI = NNI + Dep
$$
#### Personal Income (PI)
> **Personal Income (PI)** is the amount of money businesses receive. It excludes the following factors:

> * Retained earnings ($E_r$)
* Corporate income tax ($T_{ci}$)
* Social insurance contributions ($SI$)
It is calculated using the following formula:
$$
PI = NI - E_r - T_{ci} - SI
$$
##### Retained earnings
> **Retained earnings** are profits that are reinvested in the company.
##### Corporate tax
> **Corporate tax** is tax payed by corporations on profits.
##### Social insurance contributions
> **Social insurance contributions** are contributions made for social benefits of people in need. These include:

> * Retirement insurance
* Health insurance
* Unemployment Insurance
* Nursing care insurance

#### Personal Disposable Income (PDI)
> **Personal Disposable Income (PDI)** is the fraction of the *Personal Income* that is *freely usable* by the person. It takes into account the *personal income tax*.
> $$
PDI = PI - T_i
$$
##### Personal income tax
> **Personal income tax** is the tax payed on income. It is usually *progressive*, meaning earnings are grouped into *tax brackets*. It also includes *rent* and *capital gains*.

Example
: Germany tax rates:

 * First 8 400€ - 0%
 * 8401+ - 14%
 * 56 000+ - 48%

#### Nominal GDP vs Real GDP
> **Nominal GDP** does not adjust for the inflation rate. **Real GDP** accounts for inflation. The real GDP can be calculated by comparing the quantity of the products in the year being investigated, but the prices are calculated based on the *base year*, usually the last year divisible by 5. **Nominal GDP** assumes *current market prices*, **Real GDP** assumes *constant prices*.
$$
GDP_N(n) = Q_n * P_n \\
GDP_R(n) = Q_n * P_{[n/5]*5}
$$
The **Real GDP** is usually used in statistics, as it shows the growth in production and ignores inflation.

##### GDP deflator
> The **GDP deflator** is an adjustment factor to calculate the *real GDP* form the *nominal GDP*. It is published by the statistical office, that calculates it using the following formula:
$$
GDP_{df} = {GDP_N \over GDP_R}
$$
It describes the change in the prices of *all goods* in the economy.
##### Harmonized Consumer Price Index
> The **Harmonized Consumer Price Index (HCPI)**, informally "inflation rate" is a measure of the change in prices in the *consumer goods* on the market.

---

##6. Aggregate supply and Aggregate Demand

###6.1 Business cycles
> **Business cycles** describes the periodic fluctuations of economic growth compared to the trend line

> * *Recession* describes a lack of economic growth for over two quarters
* *Depression* describes a longer period of economic stagnation
* *Expansion* describes the rapid increase in economic activity after a depression
* *Boom* describes the increased economic activity following an expansion.
>
![Graph](https://upload.wikimedia.org/wikipedia/commons/f/fb/Economic_cycle.svg)

Recent examples

* 2008-2009: Financial crisis
* 2001: 9/11
* 1975: 2nd oil crisis
* 1970: 1st oil crisis

Factors impacted by business cycles:

* GDP
	* GDP fluctuates slightly with business cycles
	* In general GDP follows an upward trend
* Investment
	* Investment changes dramatically based on the business cycle
	* In general investment follows an upward trend
* Unemployment
	* Unemployment increases dramatically during *recessions* and *depressions*, but recovers during expansions and booms
	* Unemployment rate does not follow any trend
	* There is a natural rate of unemployment in every developed country for the following reasons:
		* Mismatch of offered and demanded skills
			* This is caused by *sectoral change*
		* Search unemployment
			* Job search after unexpected unemployment
		* Unemployment benefit
			* Unemployment benefits lead to declining employers with lower wages than the unemployment benefit $\rightarrow$ higher rates of unemployment
			* *Voluntary unemployment*

Example
: In Germany the unemployment benefit is 60% of the last net income for the first year.

#### Causes of the business cycle
Business cycle fluctuations can be explained with the *aggregate supply* and *aggregate demand* model.
Price level of *all* goods and services in the economy vs the Supply of *all* products (Real GDP)

### 6.2 Short-term aggregate demand curve (SRAD)
Slope is negative
####Components of aggregate demand
$$y_d = Cons + Inv + Govt  + Ex - In\\ = C(P) \text{(Wealth effect)} + I(P) \text{(Interest rate effect)} + G + Nx(P) \text{(Exchange rate effect)}$$

#### The Wealth effect

$$Wealth = Money + Bonds$$

#### Interest rate effect

* Price rises
* Bond price drops
* Bond interest rate increases
* Interest rate increases
* Loans become more expensive
* Investment decreases

#### Exchange rate effect
* Prices increase
* Households sell bonds
* Bond prices decrease
* Interest rate increases
* International investors invest in the local currency
* Appreciation of the local currency
* Net export decreases

#### Movement along the aggregate demand curve
Changes in price (inflation rate) result in a movement along the aggregate demand curve.
Inflation is measured by the *GDP depriciator* or the *HCPI*.

#### Shift along the demand curve
* Factors that influence consumption
	* Change in autonomous consumption (e.g. government benefits)
	* Change in savings
	* Change in tax levels
	* Change in stock prices $\rightarrow$ value of savings changes $\rightarrow$ consumption changes
* Factors related to investment
	* Expectations about the economy $\rightarrow$ self-fulfilling prophecy
	* Change in interest rates caused by monetary policy $\rightarrow$ Investment decreases
	* Change in corporate tax rate $\rightarrow$ investment increases
	* Change in investment incentives (tax reduction on investment, accelerated depreciation)
* Factors that influence government expenditure
	* Defense
	* Infrastructure
	* Education
	* Research and Development
	* Government spending changes $\rightarrow$ aggregate demand curve follows
* Factors that affect exports and imports
	* Boom in certain foreign countries $\rightarrow$ exports increases $\rightarrow$ the aggregate demand curve increases
	* Exchange rate of local currency changes $\rightarrow$ exports decrease $\rightarrow$ demand curve follows
	* Tariffs and trade barriers change net exports $\rightarrow$ demand curve changes
$$y_{disposable} = C + S$$

Example
: What happens to the German aggregate demand curve in the following scenarios?
1. Investment tax credit expires $\rightarrow$ investment decreases $\rightarrow$ $y$ shifts down
2. The USD exchange rate decreases $\rightarrow$ US imports increase $\rightarrow$ $y$ shifts down
3. Fall in consumer prices increases the consumers wealth $\rightarrow$ consumption, exports and investment increase $\rightarrow$ $y$ increases (move along the curve)
4. State government replace their sales tax with new taxes on interests, dividends and capital gains $\rightarrow$ nothing happens? (Consumption is a larger portion of GDP)

### 6.3 Short-run aggregate supply curve

#### Movement along the aggregate supply curve
Aggregate supply changes with price
$$S = S(P)$$

#### Reasons for the change in supply depending on the price
##### Sticky-wage theory
Trade unions negotiate the wages with the employer associations, labor contracts last *1-3 years*, therefore wages are *sticky* in the short run (1 year). Wages are usually adjusted by at least the expected inflation rate.

$$\Pi = P*Q - W*L - C_{misc}$$

Therefore the costs of the company relative to the profit decreases, therefore the aggregate supply increases

##### Sticky-price theory
> **Sticky prices** refer to the fact that the changes in price levels of goods are not volatile. Reasons for that are:

> * Price guarantees
* Price catalogues
* Price tags (exception Saturn)
* Menu costs

Consequence is a *relative price distortion*
* The longer the price remains, the lower it will be compared to competitors
	* Demand increases
	* Company replies with higher supply
* If price is increased, the relative price moves the demand down

##### Misperception theory
* Overall price level increases
* Companies think only their prices increased and all other prices stay constant
* They perceive an increase in profits
* They increase supply

$$Y^s = Y_N + \alpha (P-P_E)$$

$Y^s$ Output supplied
$Y_N$ Natural output, based on natural rate of unemployment (5%)
$\alpha$ Factor greater than 0
$P$ Price level
$P_E$ Price expectations

This is explained by the sticky *sticky wage theory*.

#### Shift of the short-run supply curve
> A **shift in the short term supply curve** happens if the price expectations change.
> If $P_E$ increases, $Y^s$ shifts to the left, if it decreases, it shifts to the left.

------
Example
: What happens to the German AS curve in the following scenarios?
1. Germany consumers expect a lower inflation rate
The expected price level decreases, so agreed wages decrease, therefore profits increase so the supplied output increases, so the supply curve shifts to the right.
2. Price level decreases due to a decrease in oil prices.
The actual price level decreases, so we have a movement along the curve.
3. German customers expect a higher inflation rate, because the euro depreciated against the USD, resulting in higher prices.
The expected price level increases, so agreed wages increases, therefore profits decrease so the supplied output decreases, so the supply curve shifts to the left.

#### Short-run equilibrium
 $$ Y^s = Y_N \text{ at } p^*$$
 
### 6.4 Long-run aggregate demand curve
> **Long run** usually refers to time periods longer than 1-2 years. *short-run* refers to time periods lower than 1-2 years. It behaves similarly to the short-run variant.

### Long-run supply curve
> In the *long-run* we have $P_E = P$ therefore $Y^s = Y_N$.
> The **long-run aggregate supply curve** is therefore a vertical line at $Y_N$ or *full employment output*.

#### Shifts of the long-run supply curve
* If labor supply increases, LRAS shifts to the right
	* Refugees
	* Increase birth rate
	* Increase female labor force participation rate
	* Increase labor force participation rate of elderly
* Changes in real capital
	* If capital stock is increased (new investment)
	* Decrease the interest rate
	* Better technology (fund R&D people!)
	* Better infrastructure
* Changes in human capital
	* Better education
* Discovery of natural resources
	* Invest in prospecting or whatever

Example
: What happens to the German LRAS curve in the following scenarios?
1. More refugees come to Germany and start to work
More workforce --> More production --> Shift to the right.
2. The German economy increases the number of patents registered.
More technology --> More production --> Shift to the right.
3. In recent years more students started study at German universities.
More education --> More productive workers --> More production --> Shift to the right.

### 6.6 Long-term equilibrium
> In the *long run* the LRAS curve keeps shifting to the right due to better technology and education, while the LTAD curve shifts to the right, because of the increasing money supply.

Education and technology are the only unrestricted factors --> Growth policy should focus on those


* Pension reform
	* Larger workforce
		* Higher GDP
		* AS curve shifts to the right
		* More disposable income
		* Higher consumption
		* AD curve shifts to the right
	* Lower Govt. exp.
		* AS curve shifts to the left slightly
* Cut public employment 120 000
	* Lower Govt. exp.
		* AS curve shifts to the left
	* Lower employment rate
		* Lower GDP
		* AS curve shifts to the left
		* Less disposable income
		* AD curve shifts to the left
* Lower corporation tax / Higher weekly hours 33% to 25% 35h+
	* More investment
		* AS curve shifts to the right
	* Higher workforce productivity
		* AS curve shifts to the right
* Education reform
	* Higher workforce productivity
		* AS curve shifts to the right
* Strengthen EU ties
	* Higher imports / exports
		* AS curve shifts to the left slightly (France is net importer)
	* More foreign investment
		* AS curve shifts to the right
* Public investment in retraining / renewable energy (50b€)
	* Higher workforce productivity
		* AS curve shifts to the right
	* Lower unemployment rate
		* Higher GDP
		* AS curve shifts to the right
		* More disposable income
		* Higher consumption
		* AD curve shifts to the right
	* Higher Govt. expenditure
		* AS curve shifts to the right

Conclusion:
All-in-all the higher employment rate brought about by Macrons policies will cause the aggregate supply curve to shift to the right. The aggregate demand curve will also shift to the right due to the higher employment rate and thus higher disposable income.

The Long-term AD curve behaves similarly to the Short-term variant, thus the same line is used to represent it. The Long-term and short-term AS curve only differs in the different expectations of the market. Since errors in expectations are near-impossible to forecast, I'll just assume the effects of Macrons policies are less significant than the market expects.



Money, Currency, Foreign Economics and Economic Policy
================================================

#### Case study: Great depression
* Stock market crash
* Consumers unable to pay back loans
* Banks go bankrupt $\rightarrow$ bank runs
	* Investment decreases
	* Consumption decreases
	* AD shifts to the left
	* Movement down along the AS curve
	* Companies go bankrupt
	* New equilibrium $\rightarrow$ Lower GDP and price
![GGB graph](http://i.imgur.com/gd18eyQ.png)
* Shrinking economy
![Graph](https://upload.wikimedia.org/wikipedia/commons/d/de/US_GDP_10-60.jpg)
* Unemployment rate rises
![Graph](https://upload.wikimedia.org/wikipedia/commons/5/58/US_Unemployment_1910-1960.gif)

## 1. The monetary system
### 1.1 Definition of money
#### Different types of money

* Salt
* Gold- / Silver coins
	* Face value = Value of metal = Exchange value
	* With relief at the rim to avoid scratching of the coin
* Metal sticks
* Sea shells (African countries)
* Hyperinflation alternate currencies
	* Zimbabwe hyperinflation $\rightarrow$ Screws imported from Mozambique
	* Chocolate
	* Cigarettes
* Banknotes
	* Gold standard
		* All currency backed by gold (currency can be exchanged for gold at the central bank any time)
		* Currently the ECB stores 15.8€ bi gold for 86€ bi currency (~17%)
	* Partially substituted by currency reserves of reserve currencies (the ECB stores 50€ bil of reserve currency (58% backing))
		* EUR
		* USD
		* CHF
		* GBP
	* FIAT money (only backed by the promise to pay it back)
* Electronic money
> **Money** is a *generally accepted* basis of trade. Thus money is what is accepted as money.

#### Definition of the ECB (European Central Bank)

* M1 (6.7€ tr)
	* Currency in circulation (1€ tr)
	* Overnight deposits of MFI and the central government (5.6€ tr)
		* Currency account
		* MFI: Monetary and Financial Institutions
* M2 (10€ tr)
	* Deposits redeemable at a period of notice up to 3 months (2.2€ tr)
		* Customer has to wait 3 months to get their money back
		* e.g. Savings account
	* Deposits with an agreed maturity of up to two years (1.4€ tr)
		* Term deposit (money is returned without explicit action)
	* Both of the above can be easily turned into M1 for transactions
* M3 (11€ tr)
	* Money market funds (0.1€ tr)
		* Fund investment in short-term securities with a term of at most two years
	* Debt securities with an agreed maturity of up to two years (0.5€ tr)
		* Security: Face value, Interest rate, Maturity/Time period
	* Repurchase agreement (0.1€ tr)
		* Seller agrees to buy back the asset in one year

### 1.2 The functions of money
Is money really needed?

* Barter is possible
* Money is chosen because it's more effective
	* Barter economy prices: $n^2-n$
	* Money economy prices: $n-1$

Features of money

* Money supply is restricted
	* Shells
	* Monopoly of production
* Store of value
	* Money must be durable
* Medium of exchange
	* Easy to transport
* Unit of account

### 1.3 The European Central Bank (ECB)

#### Features of the ECB
* Monopoly on Euro

* Executive board
	* President
	* Vice president
	* 4 other members
	* In charge of daily business
* Governing council (First Thursday in the month in the morning, press conference at 13:30)
	* Executive board
	* 19 presidents of national banks
	* Decision on all major monetary policy decisions
* General council
	* Executive board
	* 28 presidents of EU
	* Decide banking regulation

#### Independence of the ECB

* Institutional independence
	* Must be independent of political influence
		* No impact on money supply $\rightarrow$ Lower inflation rate
		* No unreasonable loans
* Personal independence
	* Presidents of member countries elect the leader of the ECB
	* 8 year term, cannot be reelected
		* Prevents blackmailing of the president with reelection

#### Goals of the ESCB

* The primary objective is to maintain price stability
	* HCPI below but close to 2% (to reflect the changes in customers requirements)
	* Sustained over the medium term
* Support economic policies
* Balanced economic growth
	* Growth rate should be close to the trend
	* Sustainable growth
* Highly competitive social market economy
	* No entry barriers, no monopoly
	* European competition agency
	* Free market
	* Subsidies to those in need
* Full employment
	* Low unemployment rate
	* All able citizens should work
	* Labor market participation rate should be high
		* Elderly
		* Female


### 1.4 Money Creation
M1 = Banknotes + Overnight deposits
* Bank notes can be issued by the central bank
* Commercial banks responsible for the overnight deposits

Central bank can influence overnight deposits by adjusting
* Reserve requirements
* Open market operations
* Determining the refinancing rate

A nominal increase ($\Delta M_O$) in the money supply causes people to deposit more in commercial banks, which in turn lend out parts of the money due to *fractional reserve banking*. These loans also make their way to the CBs, which again lend them out and so on ad infinitum. The result is a far grater total increase in money supply ($\Delta M_{total}$) proportional to the minimal reserve rate ($R_{min}$)

$$\Delta M_{total} = \Delta M_O\sum_{k=0}^\infty((1-R_{min})^k) = {M_O \over 1-(1-R_{min})} = {M_O \over R_{min}}$$

### 1.5 Monetary Policy Instruments

1. Open market operations
	* ECB buys bonds at the open market
	* Repurchase agreements
		* Interest = Main Refinancing Rate
		* Bond serves as a security in case of bankruptcy
		* Only high-quality bonds are accepted
			* Government bonds of *all* Eurozone countries
				* Austria, Belgium, Cyprus, Estonia, Finland, France, Germany, Greece, Ireland, Italy, Latvia, Lithuania, Luxembourg, Malta, the Netherlands, Portugal, Slovakia, Slovenia, and Spain
			* Corporate bonds of big companies
		* But unstable economies, such as Portugal, Italy, Greece, Spain might go bankrupt
		$\rightarrow$ Greek banks go bankrupt, *and* the bonds are worthless
			Solution: ECB should not accept bonds of unstable economies
		* Bid of commercial banks on the volume of repurchase agreement and interest rate
		* ECB determines how much to buy based on GDP growth rate, and the inflation rate target
		* If the ECB changes the refinancing rate the interest rate on loans changes with it, which leads to a change in money supply
	* Impact on money supply
		* ECB buys CB bonds
		* CB gives out access reserves as loans
		* Money supply  increases 
2. Changing the minimal reserve rate (Current at ECB: 1%; from historic 2%)
	* Increasing the minimal reserve rate forces the banks to pay more
	* Less money is left for loans
	* Less money in circulation

Example
: 

* Suppose the Bank of England has a reserve requirement of 5%.
* Commercial banks sold 100bMU of securities to the Bank of England
		* The money supply is increased by 0.1tr/0.05 = 2trMU
* The Bank of England buys another 10bMU of securities from commercial banks
		* The money supply increases by 0.01tr/0.05 = 0.2trMU
* Reserve requirements are increased to 10%
		* The money supply 1.1trMU



## 2. Inflation

### 2.1 Introduction

#### Highest inflation rates

| Country	| Year	| Monthly Inflation rate (in %)	| Time for doubling of prices|
|---------------|-------|-------------------------------|----------------------------|
| Hungary	| 7/1946| 4.19*10^16			| 15.0h			     |
| Zimbabwe	|11/2008| 7.96*10^10			| 24.7			     |
| Yugoslavia	| 1/1994| 313 000 000			| 1.41d			     |
| Srpska	| 1/1994| 297 000 000			| 1.41d			     |
| Germany	| 2/1923| 

#### Results of hyperinflation

* Avoid money
	* Fallback to the barter economy or alternative currency
	* Inefficient
* Spend money as quickly as possible
* Markets close
* Burning money

### 2.2 Money supply and Money demand

#### The Money Supply

* The central bank supplies the money independent of price
	* only dependent on the inflation rate

#### The Money Demand

* The transaction motive
	* Money is mainly needed to buy goods
	* If the price is higher more money is needed and demanded

#### Equilibrium Money Supply

[![Graph](https://raw.githubusercontent.com/bKiraly/DHBW_WISCI16_Notes/master/IMG/Econ/money_equilibrium.png)](https://github.com/bKiraly/DHBW_WISCI16_Notes/blob/master/IMG/Econ/money_equilibrium.ggb?raw=true)

* Intersection between the two curves
* If the price is higher than the equilibrium
	* People have less money to spend
	* People buy less
	* Demand drops off
	* Prices drop
	* Equilibrium is reached
* If prices are lower than the equilibrium, the reverse process takes place
* If the central bank increases the money supply
	* The equilibrium increases, so the prices rise

$$ \text{Inflation rate} = {P1-P_0 \over P_0}$$

##### Conclusion

* If too much money is supplied, inflation rate rises
* Reasons for Hyperinflation
	* Intentional increase of money supply to get rid of govt. debt (Hungary 1948)
	* Central bank prints money to finance the government budget
		* Germany 1923
		* Zimbabwe 2008
	* Economy shrinks, but money supply does not change
		* Yugoslavia 1994
		* Syria 2017

### 2.5 Quantity Theory of Money

#### Velocity of money

$$
V = {P*Y\over M}
$$

$P$: Price level
$Y$: Production
$P*Y$: Real GDP
$M$: Money supply

V stays relatively constant, and consistently reduces in the long term

##### Quantity equation

$$
M*V = P*Y\\
P = {M*V\over Y}
$$

##### Classical dichotomy 

* Real economy
	* Companies produces products using
		* Labor
		* Capital
		* Land
	* Production is limited by the production factors
	* Production Y is determined by production factiors
* Monetary economy
	* ECB produces money
	* Banks produce money independently
	* Consumers determine the velocity of money

$M$ is determined by the central bank
$V$ is determined by the consumers
$Y$ is determined by the companies
$P$ derives from all three

##### Money supply engineering

The CB needs to take the production into account when changing the money supply for its inflation rate quota

No influence of monetary and real economy

![US HCPI and M2 money supply graph](http://www.gordontlong.com/Tipping_Points-2012-Q3/07-23-12-ANALTYICS-Velocity_of_Money-M2.png)

The HCPI usually follows the money supply in 3 to 6 months (The companies need to adjust their prices)

### 2.6 Cost of Inflation

#### Shoeleather costs

A high inflation rate causes people to buy things more often

* Wasted tome

#### Menu costs

Price tags need to be changed very often

#### Relative price variability

Companies change prices at different times
Consumers buy goods at companies with lower prices
* Consumers invest more time in searching for cheap products
* Demand at company changes often, this creates distortions

#### Inflation introduced tax distortion

Capital gains tax changes based on the change in prices $\rightarrow$ the effective tax rate is higher

Therefore the state is motivated to have a higher interest rate

In the long run everyone loses:
* The investors have a lower interest rate
* The investment will be lower
* The whole economy stagnates

Income tax is also affected because of *progressive tax*
* The inflation rate pushes the person in a higher tax bracket
* The higher tax bracket has a higher tax rate
* State benefits from higher tax income

Tax brackets in Germany

| Wage		| Tax rate	|
|---------------|---------------|
| 0-7.6k€	| 0%		|
| 7.6-56k€	| 15%		|
| 56k/250k€	| 42%		|
| 250k€		| 45%		|

#### Confusion and inconvenience

Prices change often
* Consumers have problems to compare prices
* Companies have problems to determine the prices and profit

#### Redistribution of unexpected inflation

* Borrowers will win, because the real value of the initial loan is smaller
* Savers lose, because the real value of savings is smaller

### 2.7 Price of Deflation

* No shoeleather costs
* Menu costs
* Relative price variability
* Tax distortions $\rightarrow$ the govt. loses
* Confusion and inconvenience
* Arbitrary redistribution of wealth
	* The saver wins
	* The borrower loses
* *Additionally* waiting costs
	* Consumers don't buy products, because they are cheaper than before
	* The economy grinds to a halt

Circle of deflation: the lower the prices, the more people withhold spending, which leads to lower prices
ex.: Japan
The risk of deflation in the European Union is low.


#### Case study: Inflation in Zimbabwe

* Governmental money printing caused runaway inflation
* Shortages in fuel and non-durable goods
	* Have to be bought in foreign currency
* Food shortage
* Destroyed economy
* Black market economy
* Foreign currency shortage
* Economic growth of -10% per year
* Desperation

#### Case study: US withdraws from the Treaty of Paris

* Treaty of Paris would lead to a reduction of CO$_2$ emissions to 0 emission by 2050
* US coal market demand curve shifts to the right
	* No need to restrict CO$_2$
	* More energy will be produced by coal power stations
	* Tastes for coal change
	* Movement along the supply curve
	* Quantity and price of coal increases

## 3. International trade



## 4. Foreign exchange markets

### 4.1 Spot Market

#### Characteristics of foreign exchange markets
Currency exchange is always going on
Main trading hubs.

* Frankfurt
* London
* New York
* Tokyo
* Singapore
* Hong-Kong

Spot transactions are the second most important instruments on the foreign exchange market
The daily trade volume is $5.3tr (more than the *annual* GDP of Germany)

#### Types of transactions

* Spot transactions (38%)
	* Trade on the day
* Outright forwards
	* Agreement is on the day
	* Transaction takes place in the future
	* Advantage: The exchange rate is fixed $\rightarrow$ No exchange rate risk (aka. "hedging")
* Foreign exchange swaps (41%)
	* Combination of one spot and one forward trade
		* Spot transaction: Buy n amount currency A for currency B
		* Forward transaction: Sell n amount currency A for currency B
	* Capital investment in foreign countries without foreign exchange risk
* Option (6%)
	* Speculation
	* A buy/sell option is the right, but not the duty, to buy/sell foreign currency in the future whereas the exchange rate is determined in advance.
	* If it is not profitable to realize the option, it does not have to be fulfilled

#### Most Traded Currencies
As a percentage of transactions in which these are involved

* USD (87%)
* EUR (33%)
* JPY (23%)
* GBP (12%)
* AUD (9%)
* CHF
* CAD
* CNY (Ranmimbi or Yuan)

#### Sources for Exchange Rates

* Wall street journal
* [Reuters](http://reuters.com)
* [Yahoo finance](http://finance.yahoo.com)

#### Direct and Indirect Quotation

##### Direct quotation

> **Direct quotation** (aka. European quotation) is the price of a foreign currency expressed in home currency.

Example
: 
1 USD = 0.89 EUR

##### Indirect quotation

> **Indirect quotation** (aka. American quotation) describes the price of the home currency expressed in foreign currency.

Example
:
1 EUR = 1.12 USD

##### Convention
Since the introduction of the EUR (1998) the indirect quotation is used in Europe, except for the GBP, which is quoted in direct quotation.

#### Exchange Rates and Depreciation

If the exchange rate of a currency in indirect notation *increases*, the currency *appreciates*, the other currency *depreciates* compared to each-other and the other way around.

#### Base currency notation

> **Base currency notation** is a notation in the following form, whereby the base currency is always expressed in one unit. Base currency - Quote currency (ex.: EUR - USD 1.12)

#### Textbook Notation

> The **textbook notation** displays the conversion rate as a fraction, and needs to be interpreted as proper SI combined ration unit. (Example: $1.12 {USD \over EUR}$). Anther advantage is the reverse exchange rate with the proper unit can be obtained by taking the reciprocal.

#### Spot FX trading

* In the interbank market the standard trade size is $10m
* High stakes
* *"Long-term"* is 10 minutes

### 4.2 Bid-Ask Spread

> The **Bid-Ask Spread** describes the difference between the price to buy the foreign currency (Bid) and the price to sell the foreign currency (Ask). The difference represents the profit margin of the *commercial bank* that is exchanging the currency.

The bank buys the currency at a cheaper price than it is willing to sell it for.

USD: 10 000 000 CAD / 1.3462 ${CAD\over USD}$ = 7 428 316,74 USD
CAD: 7 428 316,74 USD * 1.3464 ${CAD\over USD}$ = 10 001 485,66 CAD
Profit: 1485,66


### 4.3 Cross-Exchange Rates

If n currencies exist, there are $n^2-n \over 2$ conversion ratios.
Most conversion ratios today are free-floating, meaning they are not fixed to each other.
This would need too many dealers (11 175 for 150 currencies).

Solution

* n-1 exchange rates against the USD $\rightarrow$ cover all possible exchanges with a single intermediary
* Additional regional traders (ex. EUR-GBP)
* Around 160 exchange rates are represented

### 4.4 Summary

-------
Homework:

Do profitable trade with the other currencies
Prepare the questions: 1-3 (only questions about ECB), 5-8
Solve the following problems in Ch. 26: 1-9
Inflation rate in Syria

