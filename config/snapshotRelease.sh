#!/bin/bash

version=$1
git config user.name "Milan Sekulic"
git config user.email "work.milansekulic@gmail.com"
./gradlew assembleDevRelease
git add --all
git commit -m "Bump version to $version, snapshot release"
git push -u origin HEAD


