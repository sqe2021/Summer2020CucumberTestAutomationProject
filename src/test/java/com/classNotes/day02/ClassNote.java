package com.classNotes.day02;
/*
Review previous class:

BDD --> Behavior Driven Development (in terms of test automation it's about writing test scenarios from end-user perspective)
TDD --> Test Driven Development (writing unit tests first and then code itself/application code)
DDT --> Data Driven Testing (pulling the test data outside of the code)
        (Test becomes data driven when test data is not hard-coded (not stored as variables)

If we use Cucumber BDD in our project we call this framework BDD framework.

One of the most popular framewroks was Keyword Driven Framework (it's when test steps are defined in excel file, like click here,
assert this or that).

=========================

How do you start automation?

There's a story on Jira and I need to test it:
==> If development and testing happens within the same sprint, it means that feature that is going to be tested is not on the website
until developers build it and deploy it to test environment!
==> Before new build is deployed to test environment (with the feature that i need to test), I can create feature file, write scenarios and
automate steps that are preceding that feature;

1. Create feature file
2. Write scenarios
3. Find element for the pages that are gonna be involved into my scenarios (automate existing pages if needed).
4. Store these elements into corresponding page classes
5. Provide code implementation for the test steps (implement scenario phrases)
6. Execute automation via CI server (Jenkins. This step is not mandatory in the company)
7. Generate a report
8. Attach report to the Jira issue
9. Open pull request to merge changes from your branch with a master branch. I shouldn't be able to approve pull request by myself.
It must be someone from my team (who can review my code as well).

How do we work with cucumber BDD?

Feature file --> write scenarios --> perform dryRun --> implement step definitions --> run test


Biggest benefit of Cucumber BDD is its reusability of test steps. We don't need to reimplement already implemented steps. For instance,
if we have a login step in test scenario 1, it can be used in other scenarios regardless on where they are located (scenarios can be in
any feature file).

+ Cucumber helps understand test scenarios to the non technical people. Since test scenarios are written in the plain English,
anyone can read them.

Components of BDD framework:

runner class --> to run tests. In intelliJ there's a way to run features directly without runner class.

what are the components of runner class?

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com/vytrack/step_definitions",
    dryRun = false
)
public class CucumberRUnner{
}

CucumberRunner - you can name this class in any name. Just don't call it Ayran.

Usually people call it TestRunner, CukesRUnner, CucumberRunner.

Q: Can we have more than one runner class?
A: Yes, we can have as many as we need? In my project we had around 30 runners for parallel testing.

Q: Do we need anything inside a class?
A: No!

dryRunner = false -> to run tests
dryRun = true --> to generate missing test definitions.

We always perform dryRun after adding new test scenarios.

Method that has a a code implementation of the test step calls step definition. That's why, package that groups all step definitons classes
called step_definitions.

glue - path to the package with step definitions. Can be single string or array.

features - path to the folder with a feature files. Can contain sub folder as well. Accepts single string or array.

step definitions -

 */
public class ClassNote {
}

