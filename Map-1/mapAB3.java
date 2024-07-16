public Map<String, String> mapAB3(Map<String, String> map) {
  if(map.get("a") == null && map.get("b") == null)
    return map;
  if(map.get("a") == null)
    map.put("a",map.get("b"));
  if(map.get("b") == null)
    map.put("b",map.get("a"));
  return map;
}
