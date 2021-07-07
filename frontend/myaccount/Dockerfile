FROM node:12.6.0-alpine as builder
WORKDIR '/build'

COPY myaccount ./myaccount
COPY resources ./resources
COPY third_party ./third_party

WORKDIR '/build/myaccount'

RUN npm install -g npm@7.19.1

RUN npm config set sass_binary_site https://npm.taobao.org/mirrors/node-sass/
RUN npm install --python=python2.7
RUN npm config set python python2.7

RUN npm install
RUN npm rebuild node-sass
RUN npm run build

RUN ls /build/myaccount/dist

FROM nginx
EXPOSE 80
COPY --from=builder /build/myaccount/dist /usr/share/nginx/html

