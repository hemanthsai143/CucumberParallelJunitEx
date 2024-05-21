Feature: Home Loan calculator
 
  @test
  Scenario:Verify user is able to estimate loan by using loan calculator in ANZ portal.
    Given user launches the browser with base url.
    When user enters all the details for estimation.
    |Application type|Dependents|PropertyType|AnnualIncome|Otherincome|monthlylivingExpenses|homeloan|otherloan|monthlycommitments|totalcreditlimits|
    |Single          |0         |Home        |80,000      |10,000     | 500                 |0        |100     |0                 |10,000                  |
    

    
    