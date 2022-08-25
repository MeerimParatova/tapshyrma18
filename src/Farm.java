public class Farm {
 @Override
 public String toString() {
  return "Farm{" +
          "address='" + address + '\'' +
          ", cows='" + cows + '\'' +
          ", horses='" + horses + '\'' +
          ", sheep='" + sheep + '\'' +
          ", owerName='" + owerName + '\'' +
          '}';
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getCows() {
  return cows;
 }

 public void setCows(String cows) {
  this.cows = cows;
 }

 public String getHorses() {
  return horses;
 }

 public void setHorses(String horses) {
  this.horses = horses;
 }

 public String getSheep() {
  return sheep;
 }

 public void setSheep(String sheep) {
  this.sheep = sheep;
 }

 public String getOwerName() {
  return owerName;
 }

 public void setOwerName(String owerName) {
  this.owerName = owerName;
 }

 public Farm(String address, String cows, String horses, String sheep) {
  this.address = address;
  this.cows = cows;
  this.horses = horses;
  this.sheep = sheep;
  this.owerName = owerName;
 }

 private String address;
 private String cows;
 private String horses;
 private String sheep;
 private String owerName;


}
