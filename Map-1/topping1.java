public Map<String, String> topping1(Map<String, String> map) {
  if(map.get("ice cream") != null)
    map.put("ice cream","cherry");
  map.put("bread","butter");
  return map;
}
