# Ros Model

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

This repository holds a family of metamodels defined as ecore models that together with its java and Xtext and Xtend grammar implementations facilitates the use of a set of tools and graphical plugins to create models from ROS code, compose and validate the composition of models, autogenerate deployment artifacts and check the use of standard specifications.

For further information about the metamodels, please check the [IRC19 paper](https://ieeexplore.ieee.org/document/8675668)

### Installation

Download the official [Eclipse Installer](https://www.eclipse.org/downloads/packages/installer) for your preferred operating system. Execute the installer and choose the advanced mode (menu on the right-up corner). Select the Product *Eclipse Modeling tools* package, for the version it is recommended use *Oxygen*.

![alt text](docu/images/eclipse_installer1.png)

Press *Next* and add a new *User project* pressing the green button *+*:
```
Catalog: Github Projects
Resource URIs: https://raw.githubusercontent.com/ipa320/ros-model/master/EclipseInstaller/ROSModel.setup
```
![alt text](docu/images/eclipse_installer2.png)

Select the the ROS Model project (under Github Projects -> <User>) and press next. 

By default the ROS tooling installation will be saved under the folder *ros-model-master* in your home directory. In case your github credentials are not setup on your machine, change the *Ros model Github repository* to the *HTTPs(read-write)* option.

Follow the installation instructions of the Oompth installer dialog, after the installation eclipse will be restarted to launch the ROS tooling configuration. Finally, when all the startup tasks finished press "Worbench".

### Setup the environment and start the eclipse application


1. Start the ROS tooling:
* select de.fraunhofer.ipa.ros.siriusand press the button *Run*

![alt text](docu/images/run_ros_tooling.png)

2. Import the common communication objects project (under the "examples" folder of this repository) to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```

Now that your workspace is setup and the eclipse application running you can start creating your project and defining your ROS system

![alt text](docu/images/eclipse_app_empty.png)

## Tutorials

* [Create new ROS projects and define ROS nodes](docu/NewProject.md)
* [Create a ROS model from cpp code](docu/NewRosModel.md)
* [Generation of code from models](docu/CodeGeneration.md)
* [Define a ROS system as a composition of components](docu/NewSystem.md)
* [Compare your model with a Specification](docu/CompareSpec.md)
* [Add communication objects](docu/NewCommunicationObjects.md)
* [Model extraction using introspection at runtime](https://github.com/ipa-led/ros_graph_parser)

## Model examples

The [ros-model-experiments](https://github.com/ipa-nhg/ros-model-experiments/) reposirory holds some examples o models autogenerated using the tooling and its facilities.
