void renderBanner() {

    final boolean isMAC= (platform.toUpperCase().indexOf("MAC") > -1);
    final boolean isIE=  (browser.toUpperCase().indexOf("IE") > -1);
  if ( isMAC && isIE && wasInitialized() && resize > 0 )
  {
  }
}