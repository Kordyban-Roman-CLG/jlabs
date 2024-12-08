{ pkgs, ... }: {
  channel = "unstable";
  packages = [
    pkgs.fastfetch
    pkgs.tree
    pkgs.gradle
    pkgs.temurin-bin-21
  ];
  env = { };
  idx = {
    extensions = [
      "redhat.java"
      "vscjava.vscode-java-debug"
      "vscjava.vscode-java-dependency"
      "vscjava.vscode-java-pack"
      "vscjava.vscode-java-test"
      "vscjava.vscode-gradle"
      "shardulm94.trailing-spaces"
    ];
  };
}
