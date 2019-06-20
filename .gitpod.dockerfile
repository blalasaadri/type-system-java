FROM gitpod/workspace-full

COPY .gitpod.bashrc .
RUN cat .gitpod.bashrc >> ~/.bashrc
RUN curl -s "https://get.sdkman.io" | bash \
 && bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \
             && sdk default java 11.0.2-zulufx"
