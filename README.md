# Kuali Days 2012 KRAD Hands-On Workshop

Archived from Google Code (https://code.google.com/p/krad-workshop/).

The source code used with the for the KRAD training project used in the workshop at Kuali Days 2012.

Note that the update-environment.sh script of the VM still points to the google code svn repository.  
To update the code this needs to be switched to the GitHub repository.

KRAD Training VM
================
This VM includes the basic tools needed to get started with your KRAD Training Workshop.

This vm image includes:
- Ubuntu 12.04
- Open  JDK 6/7
- Maven 3.0.4/2.2.1
- Subversion 1.6
- Spring Tool Suite 3.0 (Eclipse Juno 4.2)
- Groovy 1.8.6

System Requirements
-------------------
- Virtualbox 4.0.20 or greater
- System running 8GB of RAM (VM currently configured to 4GB; 3GB will work as well)

Getting Started
- Download the file virtual machine appliance file (vm-krtrain.0.1.0.ova) from GoogleDrive at: http://bit.ly/VUAs6S 
- Install a copy of virtualbox on your local environment.  You can download virtualbox at: www.virtualbox.org
- Once installed
- Select File > Import Appliance 
 - From the Import Wizard Select Choose
- Select the vm-krtrain.ova from the proper file location and select Open
- On the appliance Import Settings, select the import button.  
  - You may need to lower the RAM from 4096 based on your system 
- A new VM should appear in your list, double click to start

KRTRAIN VM 
----------
Login: rice
Password: rice

Once logged in:
- Doubleclick on the update-environment.sh on the Desktop
- This will update your training app (krworkshop) with the latest version 
- Open the Eclipse IDE (Spring Tool Suite 3.0 RELEASE - Green leaf icon on left)
- On the krworkshop project - right click on the project and select 'refresh'
- On the servers tab - Right click on the server and select publish
- Select the Start Button (>)
- Open Chrome and select the krworkshop bookmark located in the Chrome Bookmark Bar
