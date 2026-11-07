# Ngày 21 · vòng lặp lồng

> Java 100 ngày · 3. Lặp lại · video 1 phút 5 giây

## Bạn học gì

vòng lặp lồng

## Đáp án câu đố Ngày 20

```java
void main() {
  for (int bai = 5; bai > 0; bai--) {
    if (bai % 2 == 0) break;
    System.out.println(bai); }
}
```

In ra: `5`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 21 · VÒNG LẶP LỒNG

Câu đố trước chỉ in số năm.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int ghe = 1; ghe <= 3; ghe++)
    System.out.print(ghe);
}
```

Kết quả (máy đã chạy thật):

```text
123
```

Còn đoạn này in một dãy ghế rạp. Rạp hai mươi dãy, in sao cho khỏi chép code?

### VÒNG TRONG VÒNG — Bọc thêm một vòng

Giờ bọc nó vào một vòng dãy, đếm tới hai. Lệnh in vẫn một dòng. Vậy màn hình hiện gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int day = 1; day <= 2; day++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
  }
}
```

**Đoán trước khi chạy — Màn hình hiện gì?**

- A. `123`
- B. `123123`
- C. `112233`

Kết quả (máy đã chạy thật):

```text
123123
```

Đáp án đúng: **B**.

Một hai ba, hai lần: ghế đếm xong, dãy mới nhích.

### TÁCH TỪNG DÃY — Mỗi dãy một dòng

Thế còn hai dãy dính liền: thêm lệnh xuống dòng. Ô biến: ghế một, dãy một. Ghế hai, dãy vẫn một. Ghế ba, vẫn một.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  for (int day = 1; day <= 2; day++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
    System.out.println();
  }
}
```

Kết quả (máy đã chạy thật):

```text
123
123
```

Hết vòng ghế, dãy mới lên hai.

### Ý chính — QUY TẮC VÒNG LỒNG — Vòng trong chạy hết trước

Hóa ra giống kim giờ, kim phút: kim trong hết vòng, kim ngoài mới nhích. Khác đồng hồ, vòng ngoài hết lượt là dừng. Mẹo dân code: ngoài nhân trong ra số lần, hai mươi dãy là sáu mươi ghế.

- **Vòng trong** — chạy hết trước
- **Vòng ngoài** — rồi mới nhích một nấc
- **Khi nào dừng** — vòng ngoài hết lượt
- **Tổng số lần** — ngoài × trong

Ghi nhớ nhanh: Kim trong chạy hết vòng · Kim ngoài nhích một nấc · Ngoài × trong = số lần

### LỖI HAY GẶP — Hai vòng chung một tên

Nhưng hai vòng cùng tên thì Java chặn.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int ghe = 1; ghe <= 2; ghe++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
    System.out.println();
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: variable ghe is already defined in
method main()
```

Nó báo biến đã tồn tại, vì biến ngoài còn sống. Đổi một tên khác là xong.

## Tóm lại

Tóm lại: in cả rạp chỉ cần bọc thêm một vòng.

## Câu đố hôm nay

In ra mấy dòng? Đoán trước, rồi chạy thử. Đáp án ở Ngày 22.

```java
void main() {
  for (int day = 1; day <= 3; day++)
    for (int ghe = 1; ghe <= day; ghe++)
      System.out.println(ghe);
}
```

## Bài tập

In bảng cửu chương từ 2 đến 5.
