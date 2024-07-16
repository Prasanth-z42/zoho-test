public Map<String, String> mapAB(Map<String, String> map) {
  if(map.get("a") != null && map.get("b") != null)
    map.put("ab",map.get("a") + map.get("b"));
  return map;
}
