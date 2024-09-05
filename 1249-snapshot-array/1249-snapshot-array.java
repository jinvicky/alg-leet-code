import java.util.*;

public class SnapshotArray {

     private int snapId;

    private List<TreeMap<Integer, Integer>> snapshots;

    public SnapshotArray(int length) {
        snapId = 0;
        snapshots = new ArrayList<>(); // 초기화

        for(int i = 0; i < length; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            map.put(0,0);
            snapshots.add(map);
        }
    }
    public void set(int index, int val) {
        TreeMap<Integer, Integer> snapshot = snapshots.get(index);
        snapshot.put(snapId, val);
    }

    public int snap() {
        return snapId++; // 이게 가장 충격임... 걍 ++이 끝이라구요..?
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> snapshot = snapshots.get(index);
        Map.Entry<Integer, Integer> entry = snapshot.floorEntry(snap_id);
        return entry.getValue();
    }
}
