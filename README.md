

The project repository describes about cucumber framework and also integration with docker:


1) First we have to pull selenium/hub image:
docker pull selenium/hub 

2) Pull the browser image to register with hub as node:
docker pull selenium/node-chrome-debug

3) pull the second browser image to register with hub as node
docker pull selenium/node-firefox-debug

configuration:
run the selenium/hub image and expose the hub port (4444) to local port to access from local system:
docker run -d -p 4444:4444 --name selenium-hub selenium/hub

then registger browser(chrome) as node 1:
 docker run -d --link selenium-hub:hub selenium/node-chrome-debug

then registger browser(firefox) as node 1: 
 docker run -d --link selenium-hub:hub selenium/node-firefox-debug

once this is done, verify the all the images are running as containers:
docker ps -a

then create described capabilities and assign to remotewebdriver:
desiredcapabilities cap=
desiredcapabilities.chrome();
            cap.setcapability("version", "");
            cap.setcapability("platform", "linux");
            driver=new remotewebdriver(new url("http://localhost:4444/wd/hub"),cap);
			driver.get("url to navigate");

Also this Project is integrate with Extent Report.
The reference taken from vimalselvam git repo: https://github.com/email2vimalraj/CucumberExtentReporter

