package intention_action

object Snippets {
    const val PREFIX_SELECTION = "component"

    fun getSnippet(snippetType: SnippetType?, widget: String): String {
        return when (snippetType) {
            SnippetType.WrapWithChildComponent -> snippetWrapWithChildComponent(widget)
            SnippetType.WrapWithHTMLComponent -> snippetWrapWithHTMLComponent(widget)
            else -> ""
        }
    }

    private fun snippetWrapWithChildComponent(component: String): String {
        return String.format(
            """component(child: %1${"$"}s)""", component
        )
    }

    private fun snippetWrapWithHTMLComponent(component: String): String {
        return String.format(
            """component([%1${"$"}s])""", component
        )
    }
}