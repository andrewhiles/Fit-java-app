# Fit-java-app
A basic Java application that was created with the intention of highlighting the simplicity of adding Fit tests to any project. I've created a very lightweight employee model that contains a few Hibernate annotations and through the use of Fit, I've written tests using simple HTML tables that test whether the Hibernate validation rules are fired when creating a new Employee.

# What is Fit?
Fit is a tool for enhancing collaboration in software development. As a testing framework, it allows customers, testers, and programmers to learn what their software should do and what it does do. It automatically compares customers' expectations to actual results. In my day-to-day job as a software developer working in an agile team, I've found this to be a great way of including business analsyts, verification engineers, etc, as they can all write Fit tests without having to know too much(if anything) about how the code behind the scenes works. Results are displayed in a simple HTML file that makes it easy to interpret what has passed and what has failed.

# How does it work?
The project uses Re-fit, an adaptation of the original Fit framework which acts as a wrapper around any Fit tests allowing them to be identified as a JUnit. The Fit tests will be included with all other tests when JUnits are ran. This makes running Fit tests even easier and is super handy if you are wanting to run the tests against an application via CI/CD as Fit maven tasks can prove to be a tricky nut to crack...Believe me, I've been there. Anyways...hopefully this might be of use to someone else out there :)

# Links
http://fit.c2.com/ - Ward Cunningham's official Fit site.
http://www.javaworld.com/article/2071778/testing-debugging/fit-for-analysts-and-developers.html - Great tutorial explaining Fit by Narayanan Jayaratchagan.
