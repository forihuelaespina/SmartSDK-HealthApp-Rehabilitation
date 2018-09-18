.. _rst-graphanaIntegration:

Instructions for Graphana integration
=====================================




* File: graphanaIntegration
* Version: 0.1.1
* Authors: Patrick Heyer Wollenberg and Felipe Orihuela-Espina
* Created: March 2, 2018
* Revised: September 18, 2018
* Copyright (c) 2018 INAOE

.. _graphanaIntegration:secVersionLog:


Version Log
-----------


=======  =======================  =========== ===========
Version  Change Description       Date        Responsible
=======  =======================  =========== ===========
0.1.1    Translated to English	  18/Sep/2018 Felipe Orihuela-Espina
0.1      Initial description	  2/Mar/2018  Patrick Heyer
=======  =======================  =========== ===========




.. _graphanaIntegration:secStep1:

Step 1: From the smartwatch
---------------------------

Connect the watches using bluetooth

If the above step fails, restart the smartwatch
::

  AndroidWear ---> Top menu; Select the 2 devices until "Conexión establecida"

Activate the wifi zone of the smartwatch
::

  Settings--->More--->Conexiones y zona Wi-Fi--->Zona Wi-Fi portátil (switch on)

Activate 4G data
::

  Settings--->Uso de datos--->SIM1:TELCEL---->Mobile data (switch on)



.. _graphanaIntegration:secStep2:

Step 2: From the laptop
-----------------------


Connect laptop to the smartwatch network

Connect to network "Moto G (5)" using the icon in Windows network icon (no password needed)

Launch the virtual machine
::

  [Windows]Start --> VirtualBox --> centos6.9 --> Start

.. _graphanaIntegration:secStep2a:

Step 2a: From the virtual machine (in the laptop)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

In the virtual machine, start a new session and boot the system

* user: centos
* password: your pass here

Check that IP 192.168.43.115 is assigned
::

  ifconfig
  sudo service mongod stop
  sudo service docker stop
  sudo service docker start

wait a minute or so until everything is running and stable
::

  sudo /usr/local/bin/docker-compose stop

Repeat until no response
::

  sudo /usr/local/bin/docker-compose up -d

Repeat until it indicates it has started

If any of the followiung steps do not work, go back to the line the stop mongod


.. _graphanaIntegration:secStep3:

Step 3: From the smartwatch
---------------------------

Run the app
::

  Sensor Dashboard

Wait until all sensors have been detected and are active

Revise that both smartwatches are sending readings


.. _graphanaIntegration:secStep4:

Step 4: From the laptop
-----------------------

``DO NOT NAVIGATE ON INTERNET!!!!!!``

Check the Orion Context Broker
::

  Navegador --> 192.168.43.115:2016/version


Show Graphana
::

  Web browser --> 192.168.43.115:3000/login

* user: admin
* pass: admin

Open the dashboard; search for the corresponding link and execute the name;
::

  "New Dashboard Copy"

Add path (this may change from one laptop to another)

If a copy of the project is not directly available on your dashboard (e.g.
first time), then generate a new copy in-situ choosing whatever you like to
render.

* Note: Additional admin users is a paid option in Graphana and thus not considered here.


To refresh Graphana, click the button on the top right corner


.. _graphanaIntegration:secStep5:

Step 5: Closing
---------------

.. _secStep5a:

Step 5a: From the laptop
^^^^^^^^^^^^^^^^^^^^^^^^

::

  `sudo /usr/local/bin/docker-compose stop`


Repeat until no response
::

  sudo service docker stop
  sudo shutdown now


.. _graphanaIntegration:secStep5b:

Step 5b: From the smartwatch
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Desactivate the wifi zone
::

  Settings--->More--->Conexiones y zona Wi-Fi--->Zona Wi-Fi portátil (switch off)

Desactivate 4G data
::

  Settings--->Uso de datos--->SIM1:TELCEL---->Mobile data (switch off)
