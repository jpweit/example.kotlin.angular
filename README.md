[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/dhakehurst/example.kotlin.angular)

[![Build Status](https://travis-ci.com/dhakehurst/example.kotlin.angular.svg?branch=master)](https://travis-ci.com/dhakehurst/example.kotlin.angular)

# example.kotlin.angular
An example to illustrate the use of kotlin modules in an angular application

## Build

A zip containing the application will be in the `.gradle-build/server/distributions`

With an Angular UI

```
> cd net.akehurst.kotlin.example.addressbook
> ./gradlew build -Pclient=angular
```

With a React UI

```
> cd net.akehurst.kotlin.example.addressbook
> ./gradlew build -Pclient=react
```

## Or just run it

With an Angular UI

```
> cd net.akehurst.kotlin.example.addressbook
> ./gradlew run -Pclient=angular
```

With a React UI

```
> cd net.akehurst.kotlin.example.addressbook
> ./gradlew run -Pclient=react
```
