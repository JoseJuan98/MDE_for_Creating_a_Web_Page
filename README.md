# Workflow-DSL
## A DSL for modeling workflows and generating process management applications


## Description of the application domain and the project goals

The domain of the project is about an enterprise which needs to implement quickly web site for his business process. But it can be use too for other institutes that need web services like an hospital, or for some other services that need to manage forms and data like matriculations, filling documents...

So basically, provide a quick solution for implement basics web services.The web page it's very basic because the purpose of this project was learn how to define a Domain Specific Language


## Content
This repository contains all the projects and complementary files listed next:

- All the Eclipse projects developed as part of the assignment (abstract and concrete syntax, code generators, etc.):
	- WorkFlowDSL
	- WorkFlowDSL.edit
	- WorkFlowDSL.editor
	- WorkFlowDSL.test
	- WorkFlowDSL.diagram
	- org.eclipse.acceleo.module.generateApplication

- The example models developed with the WorkflowDSL graphical/textual model editor:
	- PizzeriaSimpleExample.src.Test1.workflowmm_diagram
		
- The code generated from the previous example models:
	- PizzeriaSimpleExample.Web.*

- Another example for generating code
	- PizzeriaWith2WorkersExample
	- Model in model. PizzeriaWith2WorkersExample
	- Code in src.*
		
- The project documentation (this document):
	- Documentation.pdf

## Planning
As a individual developer I didn’t have a planning, I just carry out with the task when I have time, but I did it in an order, the following one:

1 - Create the Meta-Model

2 - Create OCL restrictions

3 - Create a wrong model for test the OCL restrictions

4 - Create a right model

5 - Create Acceleo Code and test it with the right model

6 - Create the EuGenia editor


And between all task, all time I have to came step behind to change something.

## Diagram Example and Results

### Diagram


![Image of Model](https://github.com/JoseJuan98/MDE-for-Creating-a-Web-Page/tree/master/imgs/Diagram_Example.png)

### Some pages

![Image of ClientView](https://github.com/JoseJuan98/MDE-for-Creating-a-Web-Page/tree/master/imgs/Client.png)

![Image of Form](https://github.com/JoseJuan98/MDE-for-Creating-a-Web-Page/tree/master/imgs/form.png)
