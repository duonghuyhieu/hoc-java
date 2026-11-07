# Ngày 17 · MINI

> Java 100 ngày · 2. Ra quyết định · video 1 phút 32 giây

## Bạn học gì

MINI: máy tính phí ship

## Đáp án câu đố Ngày 16

```java
void main() {
  String ma = new String("2580");
  boolean khop = ma == "2580";
  System.out.println(!khop);
}
```

In ra: `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 17 · MÁY TÍNH PHÍ SHIP

Câu đố in true: so sánh ra sai, rồi bị đảo.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tienHang = 300000;
  int phi = 30000;
  if (tienHang > 300000) { phi = 0; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
30000
```

App hứa từ ba trăm nghìn được freeship, mà đơn đúng số đó vẫn mất ba mươi nghìn. Code chỉ sai một ký tự, bạn tìm ra chưa?

### SỬA MỘT KÝ TỰ — Thiếu một dấu bằng

Hóa ra thủ phạm là dấu lớn hơn: ba trăm nghìn không lớn hơn chính nó.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tienHang = 300000;
  int phi = 30000;
  if (tienHang >= 300000) { phi = 0; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Thêm dấu bằng, phí về không đồng. Mẹo của dân code: luôn thử đúng con số ở ranh giới, vì lỗi hay nấp ngay đó.

### Ý chính — BA LUẬT TÍNH PHÍ — Ba luật phí ship

Khoan đã, phí đó chỉ là số gõ tay, máy tính thật cần ba luật. Luật một: mười lăm nghìn mở đầu, mỗi cây số cộng ba nghìn. Luật hai: hỏa tốc thêm hai mươi nghìn. Luật ba: freeship chỉ miễn tiền cây số, còn hỏa tốc khách vẫn trả.

- **Theo km** — 15.000đ + 3.000đ mỗi km
- **Hỏa tốc** — cộng thêm 20.000đ
- **Freeship** — từ 300.000đ miễn tiền km

Ghi nhớ nhanh: Theo km cộng dồn · Hỏa tốc thêm 20k · Freeship miễn tiền km

### LUẬT MỘT VÀ HAI — Phí km cộng hỏa tốc

Vậy lấy đơn tám cây số, khách bật hỏa tốc. Bật hay tắt chỉ hai trạng thái, nên dùng kiểu đúng sai boolean. Mười lăm nghìn cộng tám lần ba nghìn, phí đang ba mươi chín nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int km = 8;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (hoaToc) {
    phi = phi + 20000;
  }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
59000
```

Hỏa tốc bật nên phí nhảy lên năm mươi chín nghìn.

### GHÉP ĐỦ BA LUẬT — Thêm freeship xuống cuối

Thế còn luật ba: đặt freeship ngay sau hỏa tốc, tiền hàng ba trăm nghìn. Khách chỉ được miễn tiền cây số, vậy màn hình in bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int km = 8;
  int tienHang = 300000;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (hoaToc) { phi = phi + 20000; }
  if (tienHang >= 300000) { phi = 0; }
  System.out.println(phi);
}
```

**Đoán trước khi chạy — Phí in ra bao nhiêu?**

- A. `59000`
- B. `0`
- C. `20000`

Kết quả (máy đã chạy thật):

```text
0
```

Đáp án đúng: **B**.

Ra không đồng: dòng freeship chạy sau, xóa luôn tiền hỏa tốc.

### ĐỔI THỨ TỰ — Đổi chỗ hai dòng

Nhưng chữa chỉ cần đổi chỗ hai điều kiện. Freeship xóa tiền cây số trước, rồi hỏa tốc mới cộng vào.

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int km = 8;
  int tienHang = 300000;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (tienHang >= 300000) { phi = 0; }
  if (hoaToc) { phi = phi + 20000; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

Phí còn hai mươi nghìn, đúng cả ba luật. Code chạy từ trên xuống, nên thứ tự dòng là luật tính tiền.

## Tóm lại

Tóm lại: ranh giới và thứ tự dòng quyết định tiền ship. Giờ thì bạn biết vì sao đơn ba trăm nghìn mất phí: thiếu một dấu bằng.

## Câu đố hôm nay

Phí cuối là bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 18.

```java
void main() {
  int phi = 39000;
  if (phi > 39000) { phi = 0; }
  System.out.println(phi + 20000);
}
```

## Bài tập

Viết máy tính phí ship: theo km, hỏa tốc, freeship từ 300.000 đồng.
