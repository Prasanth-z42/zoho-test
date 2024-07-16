public Map<String, String> mapAB2(Map<String, String> map) {
  if(map.get("a") != null && map.get("b") != null)
    if(map.get("a").equals(map.get("b"))){
      map.remove("a");
      map.remove("b");
    }
  return map;
}
