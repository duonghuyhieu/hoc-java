# Ngày 20 · break/continue

> Java 100 ngày · 3. Lặp lại · video 1 phút 7 giây

## Bạn học gì

break/continue

## Đáp án câu đố Ngày 19

```java
void main() {
  for (int qua = 1; qua < 6; qua += 2) {
    System.out.println(qua);
  }
}
```

In ra: `1` / `3` / `5`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 20 · BREAK/CONTINUE

Đố hôm qua ra một, ba, năm.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) break;
    System.out.println(bai);
  }
}
```

Kết quả (máy đã chạy thật):

```text
1
2
```

Muốn bỏ bài quảng cáo số ba, ai ngờ nhạc tắt. Thủ phạm là một chữ, bạn thấy không?

### HAI ĐOẠN, MỘT CHỮ — Đổi đúng một chữ

Hóa ra break thoát hẳn vòng lặp. Đổi sang continue: bỏ vòng này, đi tiếp. Bạn đoán giờ phát bài nào?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) continue;
    System.out.println(bai);
  }
}
```

**Đoán trước khi chạy — Playlist giờ phát những bài nào?**

- A. `1 / 2 / 4 / 5`
- B. `1 / 2`
- C. `1 / 2 / 3 / 4 / 5`

Kết quả (máy đã chạy thật):

```text
1
2
4
5
```

Đáp án đúng: **A**.

Một, hai, bốn, năm: chỉ mất bài ba.

### Ý chính — HAI LỆNH — Bỏ một vòng hay thoát hẳn

Chính chỗ này giống thang máy: lướt qua tầng đang sửa là continue. Dừng hẳn ở tầng thượng là break. Nhưng thang máy đứng yên, còn chương trình chạy tiếp dưới vòng.

- **continue** — bỏ vòng này, sang vòng sau
- **break** — thoát hẳn vòng lặp
- **Sau break** — chạy dòng ngay dưới vòng

Ghi nhớ nhanh: continue sang vòng sau · break thoát hẳn · if chọn lúc nhảy

### ĐẾM BÀI ĐÃ NGHE — Vòng bị bỏ không được đếm

Quay lại, đếm bài đã nghe: bài một, lên một. Bài hai, lên hai. Bài ba, continue nhảy qua dòng cộng, vẫn hai. Bài bốn, lên ba.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int daNghe = 0;
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
    }
    daNghe = daNghe + 1;
  }
  System.out.println(daNghe);
}
```

Kết quả (máy đã chạy thật):

```text
4
```

Bài năm, lên bốn.

### LỖI HAY GẶP — Sau continue là ngõ cụt

Khoan đã, thêm dòng in dưới continue thì hỏng.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
      System.out.println("Bỏ bài 3");
    }
    System.out.println(bai);
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: unreachable statement
```

Java báo không thể chạy tới đó. Sửa: đưa dòng in lên trước continue. Mẹo: đặt continue đầu vòng, khỏi lồng nhiều tầng.

## Tóm lại

Tóm lại: playlist tắt vì break bỏ cả vòng.

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 21.

```java
void main() {
  for (int bai = 5; bai > 0; bai--) {
    if (bai % 2 == 0) break;
    System.out.println(bai); }
}
```

## Bài tập

In các số 1–20, bỏ số chia hết cho 3, dừng khi gặp 17.
