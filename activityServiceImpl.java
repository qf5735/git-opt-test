@Override
public void onBackPressed() {
    Intent home = new Intent(Intent.ACTION_MAIN);
    home.addCategory(Intent.CATEGORY_HOME);
    startActivity(home);
}