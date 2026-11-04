# Ngày 30 · ArrayList (1/2)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

ArrayList (1/2): thêm/xoá

## Code trong video

### NGÀY 30 · ARRAYLIST: THÊM/XÓA

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var ghiBan = new ArrayList<int>();
  ghiBan.add(12);
  System.out.println(ghiBan);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: unexpected type
```

### ĐỔI MỘT CHỮ — int thành Integer

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  System.out.println(ghiBan);
}
```

Kết quả (máy đã chạy thật):

```text
[12]
```

### THÊM VÀ ĐẾM — Ba bàn, không cần khai ô

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  System.out.println(ghiBan.size());
}
```

Kết quả (máy đã chạy thật):

```text
3
```

### XÓA MỘT BÀN — Xóa phút 45

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  ghiBan.remove(45);
  System.out.println(ghiBan.size());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
IndexOutOfBoundsException: Index 45 out of
bounds for length 3 (dòng 6)
```

### XÓA ĐÚNG GIÁ TRỊ — Bọc số bằng Integer

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  ghiBan.remove(Integer.valueOf(45));
  System.out.println(ghiBan);
}
```

Kết quả (máy đã chạy thật):

```text
[12, 90]
```

## Đáp án câu đố Ngày 29

```java
void main() {
  var soMon = 7;
  var moiHop = soMon / 2;
  System.out.println(moiHop);
}
```

In ra: `3`

## Câu đố hôm nay

Bàn nào còn lại? Đoán trước, rồi chạy thử. Đáp án ở Ngày 31.

```java
void main() {
  var ban = new ArrayList<Integer>();
  ban.add(1); ban.add(7); ban.remove(1);
  System.out.println(ban);
}
```

## Bài tập

Muốn xem lại bàn thứ hai thì gọi lệnh nào?
