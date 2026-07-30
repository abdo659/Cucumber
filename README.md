# 🥒 Cucumber BDD Automation Framework

A Behavior-Driven Development (BDD) automation framework built using **Java**, **Selenium WebDriver**, **Cucumber**, **TestNG**, and the **Page Object Model (POM)**.

This project demonstrates how to create readable and maintainable automated UI tests using **Gherkin syntax** while following automation testing best practices.

---

## 📌 Project Overview

The framework automates user scenarios using Cucumber feature files and Selenium WebDriver. It follows a clean architecture by separating feature files, step definitions, page objects, and hooks, making the project easy to maintain and extend.

---

## 🛠️ Technologies Used

* Java
* Selenium WebDriver
* Cucumber (BDD)
* Gherkin
* TestNG
* Maven
* Page Object Model (POM)
* IntelliJ IDEA
* Git & GitHub

---

## 📂 Project Structure

```text
src
├── main
│   └── java
│       └── Pages
│
├── test
│   ├── java
│   │   ├── base
│   │   ├── steps
│   │   └── TestRunners
│   │
│   └── resources
│       └── features
```

---

## ✅ Framework Features

* Behavior-Driven Development (BDD)
* Gherkin Feature Files
* Step Definitions
* Page Object Model (POM)
* Hooks for Browser Setup & Teardown
* Explicit Waits
* TestNG Assertions
* Maven Build Management
* Clean and Reusable Code Structure

---

## 🧪 Test Scenario

### Login to OrangeHRM

**Scenario**

* Open OrangeHRM Login Page
* Verify Login Page
* Enter a valid username
* Enter a valid password
* Click Login
* Verify successful login to the dashboard

---

## 📝 Sample Feature File

```gherkin
Feature: Login Into OrangeHRM

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the home page
```

---

## ▶️ How to Run

Clone the repository:

```bash
git clone https://github.com/abdo659/Cucumber.git
```

Navigate to the project:

```bash
cd Cucumber
```

Run the tests:

```bash
mvn clean test
```

---

## 💡 Best Practices Applied

* Page Object Model (POM)
* Behavior-Driven Development (BDD)
* Separation of Test Logic from Page Actions
* Reusable Page Methods
* Readable Gherkin Scenarios
* Scalable Project Structure

---

## 🚀 Future Improvements

* Data-Driven Testing
* Scenario Outlines
* Cross-Browser Testing
* Screenshot Capture on Failure
* Extent Reports
* Docker Integration
* Selenium Grid
* CI/CD with GitHub Actions
* Parallel Test Execution

---

## 👨‍💻 Author

**Abdelrahman Eltabaa**

* ISTQB® CTFL v4 Certified
* Software QA Engineer
* Manual Testing | API Testing | Automation Testing

GitHub: https://github.com/abdo659

---

⭐ If you found this project useful, don't forget to give it a Star!
