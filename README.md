# { Ocelot.Online }
Ocelot is an Opencomputers emulator in your browser.

You don't need the Minecraft installation with OpenComputers modpack. You don't need to download and install any programs. You even don't need Java.

All that you need is a relatively modern browser and the Internet access.

This repository contains Ocelot.Online backend.

## Build & Run

Use `JettyLauncher` class to run the project. Set `./src/main/webapp/assets` as working directory.

The server will be binded to [http://localhost:37107/](http://localhost:37107/) address.

## Deploy

```sh
$ cd ocelot-back
$ sbt sbt universal:packageZipTarball
```

All files necessary to run Ocelot server will be zipped to `./target/universal/ocelot-x.x.x.tgz`
