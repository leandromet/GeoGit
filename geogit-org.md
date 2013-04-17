The below is used to generate the index.html with github's page generator

---

Welcome to the GeoGit project, exploring the use of distributed management of spatial
data. GeoGit draws inspiration from Git, but adapts its core concepts to handle versioning
of geospatial data. Users are able to import raw geospatial data (currently from Shapefiles, 
PostGIS or SpatiaLite) in to a repository where every change to the data is tracked. These
changes can be viewed in a history, reverted to older versions, branched in to sandboxed
areas, merged back in, and pushed to remote repositories.

For background reading see these two papers on the spatial distributed versioning [Concept](http://opengeo.org/publications/distributedversioning/) and 
[Implementation] (http://opengeo.org/publications/distributedversioningimplement/).

Details
=======

Project Lead: [Gabriel Roldan] (http://github.com/groldan)

License: Currently LGPL 2.1, soon changing to BSD New. 

Status: A 0.1 release is coming soon, with a full commandline 
interface to import data and work with repositories. A web API and user interface is slated for 0.2.

Building
-----

GeoGit is built using Maven

```
  cd src/parent
  mvn clean install
```

Online tests, require a geogit endpoint, are available using::

    mvn -Ponline

Cobertura is configured for a test coverage report::

    mvn cobertura:cobertura
    open target/site/cobertura/index.html
    
Any additional build profiles are documented in the root pom.xml .


Please carefully apply the code formatting options in the buld/eclipse/formatter.xml file. These are the standard
Java formatting options with 100 character line length for both code and comments, and 4 spaces for indentation.
It is also recommended to use the code templates from build/eclipse/codetemlates.xml.

Running
-------

See: [QuickStart] (https://github.com/opengeo/GeoGit/blob/master/doc/quickstart/quicsktart.rst) and 
[Manual] (https://github.com/opengeo/GeoGit/tree/master/doc/manual/source) (full doc builds coming soon).


Participation
=============

The project is hosted on github:

* https://github.com/opengeo/GeoGit

Participation is encouraged using the github *fork* and *pull request* workflow::

* Include test case demonstrating functionality
* Contributions are expected to pass all tests and not break the build
* Include proper license headers on your contributed files

Issues to help out on are at: https://github.com/opengeo/GeoGit/issues

For those who can't code help on documentation is always appreciated, all docs can be found at 
https://github.com/opengeo/GeoGit/tree/master/doc/ and contributed to by editing in ReStructuredText 
and using standard GitHub workflows.


Project resources:

* [Full on-line project documentation] (https://sites.google.com/a/opengeo.org/geogit-project-guide/)
* [GeoGit Discussion Group] (https://groups.google.com/a/opengeo.org/group/geogit/)
* The build is [actively monitored using hudson] (http://hudson.opengeo.org/hudson/view/geogit/)
* https://github.com/opengeo/GeoGit/issues