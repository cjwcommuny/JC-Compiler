public class ShortToUnicodeString extends ArrayInitBaseListener {
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        super.enterInit(ctx);
        System.out.print("\"");
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        super.exitInit(ctx);
        System.out.print("\"");
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        super.enterValue(ctx);
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
