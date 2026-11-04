void main() {
  int[] xu = {25, -10, 30, 15};
  int lonNhat = 0;
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
