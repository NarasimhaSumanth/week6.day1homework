Feature: Create Lead in LeafTaps application

 Scenario Outline: Create Lead - Outline


 Given Click on Create Lead
 Given Enter company name as <companyName>
 Given Enter first name as <firstName>
 Given Enter last name as <lastName>
 When Click on submit button
 Then View Lead page should be displayed create
 
 Examples: 
 |companyName	||firstName		|lastName|
 |'Legato'		||'Sumanth1'	|'k'|
 #|'Legato1'		||'Sumanth2'	|'k'|
 
 
 #Scenario: Create Lead - single scenario
 
 #Given Enter username as Demosalesmanager
 #Given Enter password as crmsfa
 #Given Click on login button
 #Given Click on CRM/SFA link
 #Given Click on Leads link
 #Given Click on Create Lead
 #Given Enter company name as Legato
 #Given Enter first name as Sumanth10
 #Given Enter last name as k
 #When Click on submit button
 #Then View Lead page should be displayed