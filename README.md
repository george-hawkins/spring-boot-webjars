The initially imported code for this project was taken unchanged from:

<https://github.com/spring-projects/spring-boot/tree/v1.4.1.RELEASE/spring-boot-samples/spring-boot-sample-websocket-tomcat>

---

Note that many browsers support WebSocket natively - however this project uses <https://github.com/sockjs/sockjs-client>

---

Switched to using webjars as per <http://www.webjars.org/documentation#springboot>

See the section "Enhanced support for RequireJS" there - this looks like a nice way to avoid an endless sequence of `<script>` tags.

However I think Typescript obviates the need for `require`.
