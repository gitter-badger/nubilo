[![Build Status](https://travis-ci.org/aellwein/nubilo.svg?branch=master)](https://travis-ci.org/aellwein/nubilo) [![Licence](http://img.shields.io/badge/Licence-MIT-brightgreen.svg)](LICENSE)

Nubilo
======

What is it?
-----------

*Nubilo* aims to be a private cloud which can host services (a.k.a. apps). 

Current State
-------------

*In development, not ready for testing yet!*


Example Installation on a Raspberry PI (running Raspbian):
----------------------------------------------------------

* ``sudo apt-get install luarocks luajit libssl-dev``
* ``sudo luarocks install turbo``
* clone this repo and run:
  * ``make``
  * ``sudo make install``

Documentation
-------------

* Generated HTML docs can be found here: ./doc/build/html/index.html


Contributing
------------
* Please follow the guidelines for good Git commit messages as described
  [here](http://chris.beams.io/posts/git-commit/).


License
-------

*Nubilo* is licensed under the terms of [MIT License](http://opensource.org/licenses/MIT). 
 
 
