package intention_action

class WrapWithChildComponentAction : WrapWithAction(SnippetType.WrapWithChildComponent) {
    override fun getText(): String {
        return "Wrap with component with child"
    }
}

class WrapWithHTMLComponentAction : WrapWithAction(SnippetType.WrapWithHTMLComponent) {
    override fun getText(): String {
        return "Wrap with HTML element or component"
    }
}
