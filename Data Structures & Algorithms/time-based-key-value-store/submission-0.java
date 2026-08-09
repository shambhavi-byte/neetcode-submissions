class TimeMap {

    class Entry {
        String value;
        int time;

        Entry(String value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    Map<String, List<Entry>> map = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
           .add(new Entry(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Entry> list = map.get(key);

        int l = 0, r = list.size() - 1;
        String ans = "";

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (list.get(m).time <= timestamp) {
                ans = list.get(m).value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
}