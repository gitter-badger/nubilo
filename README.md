[![Build Status](https://travis-ci.org/aellwein/nubilo.svg?branch=master)](https://travis-ci.org/aellwein/nubilo) [![Licence](http://img.shields.io/badge/Licence-MIT-brightgreen.svg)](LICENSE)

Nubilo
======

What is it?
-----------

*Nubilo* aims to be a private cloud which can host services (a.k.a. apps). 

Current State
-------------

*In development, not ready for testing yet!*

Prerequisites
-------------

* luajit
* luarocks
* turbo (installed with LuaRocks)
* busted (used only for tests, installed with LuaRocks
* luacov (used only for tests coverage, installed with LuaRocks)

Building
--------

* ``sudo luarocks install luajit``
* ``sudo luarocks install turbo``
* ``sudo luarocks install busted``
* ``make``


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
 
 
