{ pkgs, ... }: {
  channel = "unstable";
  packages = [
    pkgs.fastfetch
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
      "eamodio.gitlens"
      "shardulm94.trailing-spaces"
    ];
  };
}
