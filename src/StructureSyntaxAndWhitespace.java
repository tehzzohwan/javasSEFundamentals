public class StructureSyntaxAndWhitespace {
// Programs are made up of statements
// statements end with semicolon
// parts separated by zero or more whitespaces
// whitespace include space, tab, enter characters
    // whitespaces don't have effects on statements

    public static void whitespace() {
        // this is a standalone line comment
        System.out.println("no whitespace"); // this is a line comment
        System.out.println("    left whitespace");
        System.out.println("right whitespace     ");
        // they all print the same
    }
/*
comments..
they are used to add human-readable notes to source code
used to hide source code without deleting

types of comments
//... --> Line comment: text is ignored until the end of current line
/*... --> Bloc comment: text is ignored within the block
 */

}
