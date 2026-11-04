# Ngày 55 · MINI

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

MINI: thanh toán Tiền mặt/Thẻ/Ví bằng đa hình

## Code trong video

### NGÀY 55 · MINI: THANH TOÁN ĐA HÌNH

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
void main() {
  ThanhToan cachTra = new The();
  System.out.println(cachTra.phi());
}
```

Kết quả (máy đã chạy thật):

```text
3000
```

### ĐỔI CÁCH TRẢ — Cùng một biến đổi đối tượng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class ViDienTu implements ThanhToan {
  public int phi() { return 1000; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new ViDienTu();
  System.out.println(cachTra.phi());
}
```

Kết quả (máy đã chạy thật):

```text
1000
```

### THÊM TIỀN MẶT — Main không cần một if

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class TienMat implements ThanhToan {
  public int phi() { return 0; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### CỘNG VÀO ĐƠN — Phí cộng vào giỏ hàng

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; }
}
void main() {
  int tongTien = 250000;
  ThanhToan cachTra = new The();
  tongTien = tongTien + cachTra.phi();
  System.out.println(tongTien);
}
```

Kết quả (máy đã chạy thật):

```text
253000
```

### LỖI HAY GẶP — Gõ sai một chữ hoa

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface ThanhToan { int phi(); }
class TienMat implements ThanhToan {
  public int Phi() { return 0; } }
void main() {
  ThanhToan cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: TienMat is not abstract and does
not override abstract method phi() in
ThanhToan
```

## Đáp án câu đố Ngày 54

```java
void main() {
  Object ten1 = "Mưa";
  Object ten2 = new String("Mưa");
  System.out.println(ten1.equals(ten2));
}
```

In ra: `true`

## Câu đố hôm nay

Bằng nhau hay không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 56.

```java
void main() {
  Object phi = 1000;
  System.out.println(phi.equals(1000L));
}
```

## Bài tập

Thêm lớp TraGop phí 5.000 đồng, dòng gọi phí trong main giữ nguyên.
