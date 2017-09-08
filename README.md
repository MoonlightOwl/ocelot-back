# { Ocelot.Online }
Ocelot is an Opencomputers emulator in your browser.

You don't need the Minecraft installation with OpenComputers modpack. You don't need to download and install any programs. You even don't need Java.

All that you need is a relatively modern browser and the Internet access.

This repository contains Ocelot.Online backend.

## Build & Run

```sh
$ cd ocelot-back
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:37107/](http://localhost:37107/) in your browser.

## Deploy

```sh
$ cd ocelot-back
$ sbt sbt universal:packageZipTarball
```

All files necessary to run Ocelot server will be zipped to `./target/universal/ocelot-x.x.x.tgz`