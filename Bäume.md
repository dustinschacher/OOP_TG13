# Merkblatt zu Binärbäumen in Java

## 1. Einleitung
Ein Binärbaum ist eine hierarchische Datenstruktur, bei der jeder Knoten höchstens zwei Kinder hat: ein linkes und ein rechtes Kind. Binärbäume sind nützlich für die Organisation und Speicherung von Daten.

## 2. Eigenschaften von Binärbäumen
- **Höhe**: Die Höhe eines Binärbaums ist die Länge des längsten Pfades von der Wurzel zu einem Blatt. Ein leerer Baum hat eine Höhe von -1.
- **Anzahl der Knoten**: Bei einer Höhe \( h \) kann die maximale Anzahl der Knoten \( 2^{h+1} - 1 \) betragen.
- **Blätter**: Knoten ohne Kinder werden als Blätter bezeichnet.
- **Grad**: Der Grad eines Knotens ist die Anzahl seiner Kinder (maximal 2 bei einem Binärbaum).

## 3. Operationen in einem Binärbaum
### 3.1. Einfügen
Das Einfügen eines Knotens erfolgt rekursiv, indem der Wert an der richtigen Stelle platziert wird.

### 3.2. Suchen
Das Suchen eines Wertes erfolgt durch einen Vergleich mit dem aktuellen Knoten und dem Rekursivaufruf der entsprechenden Unterbäume.

### 3.3. Traversierung
Die Traversierung beschreibt, wie die Knoten eines Baumes besucht werden. Gängige Traversierungsarten sind:
- **Inorder** (links, Wurzel, rechts)
- **Preorder** (Wurzel, links, rechts)
- **Postorder** (links, rechts, Wurzel)

## 4. Codebeispiele

### 4.1. Implementierung eines Binärbaums

```java
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Einfügen eines neuen Knotens
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Inorder Traversierung
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Preorder Traversierung
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder Traversierung
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
}
```
## 4.2 Beispiel für die Nutzung des Binärbaums
```Java
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversierung:");
        tree.inorder(); // Ausgabe: 20 30 40 50 60 70 80
        System.out.println("\nPreorder Traversierung:");
        tree.preorder(); // Ausgabe: 50 30 20 40 70 60 80
        System.out.println("\nPostorder Traversierung:");
        tree.postorder(); // Ausgabe: 20 40 30 60 80 70 50
    }
}
```

## 5. Fazit

Binärbäume sind eine grundlegende Datenstruktur in der Informatik. Sie ermöglichen effiziente Such-, Einfüge- und Traversierungsoperationen und sind eine Grundlage für komplexere Datenstrukturen wie binäre Suchbäume oder AVL-Bäume.