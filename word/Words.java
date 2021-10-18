package word;

public class Words {
    private String st;
    private String delim;
    private boolean has_more_tokens;

    public Words(String st, String delim) {
        this.st = st.trim();
        this.delim = delim;
        this.has_more_tokens = this.st.length() == 0 ? false : true;
    }

    public Boolean hasMoreTokens() {
        return this.has_more_tokens;
    }

    public String nextToken() {
        String word;
        int index = this.st.indexOf(this.delim);
        if (index == -1) {
            this.has_more_tokens = false;
            word = this.st;
        } else {
            word = this.st.substring(0, index);
            this.st = this.st.substring(index + 2, this.st.length()).trim();
        }
        return word;
    }
}
