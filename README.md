# AmaniSanadAutomationTask
- Automation task for software test engineer

## Technologies  used
* Java as a programming languge
* Selenium as automation Framework
* POM as a design pattern
* TestNG as a testing FrameWork
* Maven as building tool
* BDD approache supported by Cucumber 

## Test Scenario
   -  Favorite a program from programs page
   -  Change currency to Euro
   
## Code WorkFlow 
  - I used test folder for follwoing packages 
### 1. Pages
   - Following POM, I have created a seprate .java class for web elements in each page 
      * header
      * dashboardPage
      * homePage
      * loginPage
      * progDetailsPage
      *programsPage
### 2. stepDefns
- I've created first class "Hooks", no need for a feature file
1. Hooks
    - contains methods that can run at various points in the Cucumber execution cycle in our case will run only Before first step of each scenario and After first step of each scenario. 
2. SD1_favoriteProgram 
     - I've created relative step Definition class for favorite Program feature 
3. SD2_ChanageCurrency
     - I've created relative step Definition class for Chanage Currency feature 
### 3. testRunner
- I used following options 
1. "feartures"
   - To add feartures folder path
2. "glue"
   - To add step Defentions path
3. "Plugin"
   - To add "pretty" as Built-in reporter plugin for local reports 
 4. "tags"
    - To distingush the feature files I want to run
### 4. Config
- To add file reader .java class to read configurations from ".properties file" File in our Framework 

## I used main folder for follwoing packages 
 1. resources
     - to add used drivers
 2. Features 
     - To add feature files
 3. Properties 
     - to avoid hard coded inputs and expected outputs by storing parameters in ".properties file"
## Report generation: 
1. Clone the repo 
2. Open project in Inteljie 
3. Click on Maven tab on the right
   - Delete target folder if exist 
   - Click on Clean
   - Click on Verify to Run the project 
4. Open target folder 
5. Open  "cucumber-html-reports" folder 
6. Open   "overview-features.html" file 
7. Open this file in Browser
