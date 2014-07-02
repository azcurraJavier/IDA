package it.businesslogic.ireport;

public class BarcodeReportElement {

private String title = "Sample barcode";
private boolean legend = false;
private boolean showText = false;
private String text = "0815";
private int type = 13;
private boolean checkSum = false;
private String lastError = null;

public BarcodeReportElement(int x, int y, int width, int height) {

setBarCodeImg(type, text, showText, checkSum);
   
}

public void setBarCodeImg(int type, String text, boolean showText, boolean checkSum) {

String bcCall = "it.businesslogic.ireport.barcode.BcImage.getBarcodeImage";
boolean isFormula = text.trim().startsWith("$");  

if (isFormula) {
bcCall +=",";
bcCall += text;
bcCall +=",";
} else {
bcCall +=",";
bcCall +=text;
bcCall +=",";
}
}

public void setImageExpression(String imageExpression) {

String iE = imageExpression;

if (iE.equals("input")) {
text = "ok";
} else {
text = "fail";
}

showText = true;
checkSum = false;

update();
}

public void setShowText(boolean showText) {
this.showText = showText;
update();
}

public boolean isShowText() {
return this.showText;
}

public void update() {

setBarCodeImg(type, text, showText, checkSum);

boolean isFormula = text;   

}

public java.lang.String getTitle() {
return title;
}

public void setTitle(java.lang.String title) {
this.title = title;
this.setType(null);
}

public String getText() {
return this.text;
}

public void setText(String text) {
this.text = text;
update();
}

public int getType() {
return this.type;
}

public void setType(int type) {
this.type = type;
}

public boolean isCheckSum() {
return this.checkSum;
}

public void setCheckSum(boolean checkSum) {
this.checkSum = checkSum;
update();
}

public String getLastError() {
return lastError;
}

}
