@GetMapping("/hello-world")
@ResponseBody
public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
  return new Greeting(counter.incrementAndGet(), String.format(template, name));
}