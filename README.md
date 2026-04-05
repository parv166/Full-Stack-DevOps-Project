# 🚀 Full Stack DevOps Project

## 🧠 Project Overview

This project demonstrates a complete **full-stack application deployment pipeline** with a strong focus on DevOps practices.

It includes a frontend interface, backend REST API, and database, all integrated and deployed on a cloud environment using containerization and reverse proxy architecture.

The primary goal of this project is to showcase **real-world DevOps skills**, including deployment, debugging, system integration, and infrastructure management.

---

## ⚙️ Tech Stack

* **Frontend:** HTML, JavaScript (Fetch API)
* **Backend:** Spring Boot (Java)
* **Database:** PostgreSQL
* **DevOps Tools:** Docker, Nginx
* **Cloud Platform:** AWS EC2
* **CI/CD:** GitHub Actions

---

## 🏗️ Architecture
![taskflow_architecture_diagram](https://github.com/user-attachments/assets/e89eb7d4-86f2-45ab-b4c8-19fd4665febc)
![Uploading taskflow_architecture_<svg width="100%" viewBox="0 0 680 740" xmlns="http://www.w3.org/2000/svg">
<defs>
  <marker id="arrow" viewBox="0 0 10 10" refX="8" refY="5" markerWidth="6" markerHeight="6" orient="auto-start-reverse">
    <path d="M2 1L8 5L2 9" fill="none" stroke="context-stroke" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
  </marker>
<mask id="imagine-text-gaps-e9w95a" maskUnits="userSpaceOnUse"><rect x="0" y="0" width="680" height="740" fill="white"/><rect x="-12.686609268188477" y="82.42216491699219" width="62.2259635925293" height="17.60007667541504" fill="black" rx="2"/><rect x="-1.7900197505950928" y="287.4221496582031" width="39.732566833496094" height="17.60007667541504" fill="black" rx="2"/><rect x="-14.634536743164062" y="517.4221801757812" width="65.50154113769531" height="17.60007667541504" fill="black" rx="2"/><rect x="80.6279296875" y="65.3110580444336" width="77.02677917480469" height="21.37787628173828" fill="black" rx="2"/><rect x="74.89039611816406" y="84.44440460205078" width="88.81705474853516" height="19.111202239990234" fill="black" rx="2"/><rect x="180.59535217285156" y="59.91104507446289" width="54.05373001098633" height="19.111196517944336" fill="black" rx="2"/><rect x="256.9518737792969" y="65.3110580444336" width="90.94254302978516" height="21.37787628173828" fill="black" rx="2"/><rect x="249.5497589111328" y="84.44440460205078" width="105.60136413574219" height="19.111202239990234" fill="black" rx="2"/><rect x="477.4139709472656" y="57.311065673828125" width="105.46034240722656" height="21.37787628173828" fill="black" rx="2"/><rect x="447.6166076660156" y="78.44440460205078" width="164.1239013671875" height="19.111196517944336" fill="black" rx="2"/><rect x="456.51214599609375" y="94.44440460205078" width="146.22021484375" height="19.111196517944336" fill="black" rx="2"/><rect x="431.6612854003906" y="110.44439697265625" width="196.6774444580078" height="19.111196517944336" fill="black" rx="2"/><rect x="456.8721923828125" y="126.44441223144531" width="146.25564575195312" height="19.111196517944336" fill="black" rx="2"/><rect x="310.24444580078125" y="158.44439697265625" width="53.32618713378906" height="19.111196517944336" fill="black" rx="2"/><rect x="246.76953125" y="227.31106567382812" width="110.74269104003906" height="21.37787628173828" fill="black" rx="2"/><rect x="234.92259216308594" y="246.44439697265625" width="134.15487670898438" height="19.111196517944336" fill="black" rx="2"/><rect x="69.60115814208984" y="317.3110656738281" width="89.10245513916016" height="21.37787628173828" fill="black" rx="2"/><rect x="63.36779022216797" y="336.44439697265625" width="101.26441192626953" height="19.111196517944336" fill="black" rx="2"/><rect x="207.92477416992188" y="317.3110656738281" width="92.45377349853516" height="21.37787628173828" fill="black" rx="2"/><rect x="214.8133544921875" y="336.44439697265625" width="78.97249603271484" height="19.111196517944336" fill="black" rx="2"/><rect x="350.71087646484375" y="317.3110656738281" width="86.88461303710938" height="21.37787628173828" fill="black" rx="2"/><rect x="357.97723388671875" y="336.44439697265625" width="72.64938354492188" height="19.111196517944336" fill="black" rx="2"/><rect x="482.7243957519531" y="317.3110656738281" width="102.64069366455078" height="21.37787628173828" fill="black" rx="2"/><rect x="480.13897705078125" y="336.44439697265625" width="106.9665298461914" height="19.111196517944336" fill="black" rx="2"/><rect x="240.93345642089844" y="465.3110656738281" width="215.7248992919922" height="21.37787628173828" fill="black" rx="2"/><rect x="275.7777404785156" y="503.3110656738281" width="146.4445343017578" height="21.37787628173828" fill="black" rx="2"/><rect x="135.4530792236328" y="547.3110961914062" width="146.63442993164062" height="21.37787628173828" fill="black" rx="2"/><rect x="161.89767456054688" y="566.4443969726562" width="93.44908905029297" height="19.111196517944336" fill="black" rx="2"/><rect x="180.04290771484375" y="582.4443969726562" width="57.91416931152344" height="19.111196517944336" fill="black" rx="2"/><rect x="177.61685180664062" y="598.4443969726562" width="63.07474899291992" height="19.111196517944336" fill="black" rx="2"/><rect x="161.5435028076172" y="614.4443969726562" width="94.75589752197266" height="19.111196517944336" fill="black" rx="2"/><rect x="444.3408203125" y="547.3110961914062" width="69.62428665161133" height="21.37787628173828" fill="black" rx="2"/><rect x="446.6606140136719" y="566.4443969726562" width="65.1684455871582" height="19.111196517944336" fill="black" rx="2"/><rect x="411.0666809082031" y="582.4443969726562" width="135.61734008789062" height="19.111196517944336" fill="black" rx="2"/><rect x="424.54278564453125" y="598.4443969726562" width="108.91445922851562" height="19.111196517944336" fill="black" rx="2"/><rect x="454.5998840332031" y="614.4443969726562" width="49.10274887084961" height="19.111196517944336" fill="black" rx="2"/><rect x="318.9478454589844" y="567.9110717773438" width="39.07790756225586" height="19.111196517944336" fill="black" rx="2"/><rect x="282.6133728027344" y="390.91107177734375" width="65.37244033813477" height="19.111196517944336" fill="black" rx="2"/></mask></defs>

<!-- ── LANE LABELS ── -->
<text x="18" y="95" text-anchor="middle" transform="rotate(-90,18,95)" style="font-size:11px;fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:11px;font-weight:400;text-anchor:middle;dominant-baseline:auto">Developer</text>
<text x="18" y="300" text-anchor="middle" transform="rotate(-90,18,300)" style="font-size:11px;fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:11px;font-weight:400;text-anchor:middle;dominant-baseline:auto">CI/CD</text>
<text x="18" y="530" text-anchor="middle" transform="rotate(-90,18,530)" style="font-size:11px;fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:11px;font-weight:400;text-anchor:middle;dominant-baseline:auto">Production</text>

<!-- ── LANE BANDS ── -->
<rect x="34" y="30" width="636" height="150" rx="10" fill="var(--color-background-secondary)" stroke="var(--color-border-tertiary)" stroke-width="0.5" style="fill:rgb(38, 38, 36);stroke:rgba(222, 220, 209, 0.15);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<rect x="34" y="198" width="636" height="216" rx="10" fill="var(--color-background-secondary)" stroke="var(--color-border-tertiary)" stroke-width="0.5" style="fill:rgb(38, 38, 36);stroke:rgba(222, 220, 209, 0.15);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<rect x="34" y="432" width="636" height="278" rx="10" fill="var(--color-background-secondary)" stroke="var(--color-border-tertiary)" stroke-width="0.5" style="fill:rgb(38, 38, 36);stroke:rgba(222, 220, 209, 0.15);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>

<!-- ═══════════════════════════════ -->
<!-- LANE 1: Developer               -->
<!-- ═══════════════════════════════ -->

<!-- Dev machine -->
<g onclick="sendPrompt('What is in the developer machine for taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="54" y="56" width="130" height="52" rx="8" stroke-width="0.5" style="fill:rgb(68, 68, 65);stroke:rgb(180, 178, 169);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="119" y="76" text-anchor="middle" dominant-baseline="central" style="fill:rgb(211, 209, 199);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Developer</text>
  <text x="119" y="94" text-anchor="middle" dominant-baseline="central" style="fill:rgb(180, 178, 169);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">Local machine</text>
</g>

<!-- Git push -->
<line x1="184" y1="82" x2="232" y2="82" marker-end="url(#arrow)" stroke="#888780" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<text x="208" y="74" text-anchor="middle" style="fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:auto">git push</text>

<!-- GitHub Repo -->
<g onclick="sendPrompt('What files are in the taskflow GitHub repo?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="232" y="56" width="140" height="52" rx="8" stroke-width="0.5" style="fill:rgb(60, 52, 137);stroke:rgb(175, 169, 236);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="302" y="76" text-anchor="middle" dominant-baseline="central" style="fill:rgb(206, 203, 246);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">GitHub repo</text>
  <text x="302" y="94" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">parv166/taskflow</text>
</g>

<!-- Repo contents -->
<g onclick="sendPrompt('Explain the taskflow repo structure')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="420" y="46" width="220" height="112" rx="8" stroke-width="0.5" style="fill:rgb(68, 68, 65);stroke:rgb(180, 178, 169);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="530" y="68" text-anchor="middle" dominant-baseline="central" style="fill:rgb(211, 209, 199);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Repo contents</text>
  <text x="530" y="88" text-anchor="middle" dominant-baseline="central" style="fill:rgb(180, 178, 169);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">src/ — Spring Boot backend</text>
  <text x="530" y="104" text-anchor="middle" dominant-baseline="central" style="fill:rgb(180, 178, 169);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">frontend/ — HTML/JS UI</text>
  <text x="530" y="120" text-anchor="middle" dominant-baseline="central" style="fill:rgb(180, 178, 169);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">Dockerfile + docker-compose.yml</text>
  <text x="530" y="136" text-anchor="middle" dominant-baseline="central" style="fill:rgb(180, 178, 169);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">.github/workflows/ci.yml</text>
</g>

<line x1="372" y1="82" x2="418" y2="82" marker-end="url(#arrow)" stroke="#888780" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>

<!-- ═══════════════════════════════ -->
<!-- LANE 2: CI/CD (GitHub Actions)  -->
<!-- ═══════════════════════════════ -->

<!-- Trigger -->
<line x1="302" y1="108" x2="302" y2="218" marker-end="url(#arrow)" stroke="#7F77DD" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<text x="315" y="168" dominant-baseline="central" style="fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:start;dominant-baseline:central">triggers</text>

<!-- GitHub Actions -->
<g onclick="sendPrompt('What does the GitHub Actions CI/CD pipeline do in taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="200" y="218" width="204" height="52" rx="8" stroke-width="0.5" style="fill:rgb(60, 52, 137);stroke:rgb(175, 169, 236);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="302" y="238" text-anchor="middle" dominant-baseline="central" style="fill:rgb(206, 203, 246);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">GitHub Actions</text>
  <text x="302" y="256" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">CI/CD pipeline (ci.yml)</text>
</g>

<!-- Steps row -->
<g onclick="sendPrompt('What does the Maven build step do?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="54" y="308" width="120" height="52" rx="8" stroke-width="0.5" style="fill:rgb(8, 80, 65);stroke:rgb(93, 202, 165);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="114" y="328" text-anchor="middle" dominant-baseline="central" style="fill:rgb(159, 225, 203);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Maven build</text>
  <text x="114" y="346" text-anchor="middle" dominant-baseline="central" style="fill:rgb(93, 202, 165);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">mvn clean install</text>
</g>

<g onclick="sendPrompt('How is the Docker image built?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="194" y="308" width="120" height="52" rx="8" stroke-width="0.5" style="fill:rgb(8, 80, 65);stroke:rgb(93, 202, 165);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="254" y="328" text-anchor="middle" dominant-baseline="central" style="fill:rgb(159, 225, 203);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Docker build</text>
  <text x="254" y="346" text-anchor="middle" dominant-baseline="central" style="fill:rgb(93, 202, 165);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">builds image</text>
</g>

<g onclick="sendPrompt('How does Docker Hub push work in the pipeline?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="334" y="308" width="120" height="52" rx="8" stroke-width="0.5" style="fill:rgb(8, 80, 65);stroke:rgb(93, 202, 165);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="394" y="328" text-anchor="middle" dominant-baseline="central" style="fill:rgb(159, 225, 203);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Docker Hub</text>
  <text x="394" y="346" text-anchor="middle" dominant-baseline="central" style="fill:rgb(93, 202, 165);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">push image</text>
</g>

<g onclick="sendPrompt('How does the pipeline deploy to EC2?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="474" y="308" width="120" height="52" rx="8" stroke-width="0.5" style="fill:rgb(8, 80, 65);stroke:rgb(93, 202, 165);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="534" y="328" text-anchor="middle" dominant-baseline="central" style="fill:rgb(159, 225, 203);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Deploy to EC2</text>
  <text x="534" y="346" text-anchor="middle" dominant-baseline="central" style="fill:rgb(93, 202, 165);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">SSH + docker pull</text>
</g>

<!-- Fan out from GitHub Actions to steps -->
<line x1="302" y1="270" x2="302" y2="286" stroke="var(--color-border-secondary)" stroke-width="0.5" fill="none" style="fill:none;stroke:rgba(222, 220, 209, 0.3);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="114" y1="286" x2="534" y2="286" stroke="var(--color-border-secondary)" stroke-width="0.5" fill="none" style="fill:none;stroke:rgba(222, 220, 209, 0.3);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="114" y1="286" x2="114" y2="306" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="254" y1="286" x2="254" y2="306" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="394" y1="286" x2="394" y2="306" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="534" y1="286" x2="534" y2="306" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>

<!-- Step connector arrows -->
<line x1="174" y1="334" x2="192" y2="334" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="314" y1="334" x2="332" y2="334" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<line x1="454" y1="334" x2="472" y2="334" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>

<!-- ═══════════════════════════════ -->
<!-- LANE 3: Production (EC2)        -->
<!-- ═══════════════════════════════ -->

<!-- Arrow from deploy step to EC2 -->
<line x1="534" y1="360" x2="534" y2="452" marker-end="url(#arrow)" stroke="#7F77DD" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>

<!-- EC2 box (structural container) -->
<g onclick="sendPrompt('What runs inside the EC2 instance for taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="54" y="452" width="590" height="238" rx="12" stroke-width="0.5" style="fill:rgb(12, 68, 124);stroke:rgb(133, 183, 235);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="349" y="476" text-anchor="middle" dominant-baseline="central" style="fill:rgb(181, 212, 244);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">AWS EC2 instance (ap-south-1)</text>
</g>

<!-- Docker Compose sub-box -->
<g onclick="sendPrompt('What does docker-compose run in taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="74" y="494" width="550" height="176" rx="8" stroke-width="0.5" style="fill:rgb(8, 80, 65);stroke:rgb(93, 202, 165);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="349" y="514" text-anchor="middle" dominant-baseline="central" style="fill:rgb(159, 225, 203);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">docker-compose.yml</text>
</g>

<!-- Spring Boot service -->
<g onclick="sendPrompt('What does the Spring Boot backend do in taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="94" y="534" width="230" height="116" rx="8" stroke-width="0.5" style="fill:rgb(60, 52, 137);stroke:rgb(175, 169, 236);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="209" y="558" text-anchor="middle" dominant-baseline="central" style="fill:rgb(206, 203, 246);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Spring Boot backend</text>
  <text x="209" y="576" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">Java 17 · Maven</text>
  <text x="209" y="592" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">REST API</text>
  <text x="209" y="608" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">port 8080</text>
  <text x="209" y="624" text-anchor="middle" dominant-baseline="central" style="fill:rgb(175, 169, 236);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">taskflow image</text>
</g>

<!-- Frontend service -->
<g onclick="sendPrompt('What does the frontend serve in taskflow?')" style="fill:rgb(0, 0, 0);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto">
  <rect x="354" y="534" width="250" height="116" rx="8" stroke-width="0.5" style="fill:rgb(113, 43, 19);stroke:rgb(240, 153, 123);color:rgb(255, 255, 255);stroke-width:0.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
  <text x="479" y="558" text-anchor="middle" dominant-baseline="central" style="fill:rgb(245, 196, 179);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:14px;font-weight:500;text-anchor:middle;dominant-baseline:central">Frontend</text>
  <text x="479" y="576" text-anchor="middle" dominant-baseline="central" style="fill:rgb(240, 153, 123);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">HTML / JS</text>
  <text x="479" y="592" text-anchor="middle" dominant-baseline="central" style="fill:rgb(240, 153, 123);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">Served from frontend/</text>
  <text x="479" y="608" text-anchor="middle" dominant-baseline="central" style="fill:rgb(240, 153, 123);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">Calls backend API</text>
  <text x="479" y="624" text-anchor="middle" dominant-baseline="central" style="fill:rgb(240, 153, 123);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:central">port 80</text>
</g>

<!-- Arrow between services -->
<line x1="324" y1="592" x2="352" y2="592" marker-end="url(#arrow)" stroke="#1D9E75" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<text x="338" y="582" text-anchor="middle" style="fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:auto">HTTP</text>

<!-- Docker Hub arrow into EC2 -->
<line x1="394" y1="360" x2="270" y2="452" marker-end="url(#arrow)" stroke="#7F77DD" mask="url(#imagine-text-gaps-e9w95a)" style="fill:none;stroke:rgb(156, 154, 146);color:rgb(255, 255, 255);stroke-width:1.5px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:16px;font-weight:400;text-anchor:start;dominant-baseline:auto"/>
<text x="315" y="405" text-anchor="middle" style="fill:rgb(194, 192, 182);stroke:none;color:rgb(255, 255, 255);stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;opacity:1;font-family:&quot;Anthropic Sans&quot;, -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, sans-serif;font-size:12px;font-weight:400;text-anchor:middle;dominant-baseline:auto">pull image</text>

</svg>diagram.svg…]()


## 🔥 Key Features

* ✅ Full-stack application deployment on cloud (AWS EC2)
* ✅ Reverse proxy implementation using Nginx
* ✅ Backend containerization using Docker
* ✅ Database container with persistent storage
* ✅ CI/CD pipeline for automated backend deployment
* ✅ Clean separation of frontend, backend, and database layers

---

## 🤖 AI Usage

AI tools were used to assist with:

* Initial frontend structure generation
* Minor debugging and syntax corrections

All major DevOps work was handled manually, including:

* Nginx configuration and reverse proxy setup
* Docker networking and container management
* Debugging deployment issues (CORS, networking, ports)
* Implementing persistent storage
* Managing cloud infrastructure (AWS EC2)

---

## 🧪 API Endpoints

| Method | Endpoint | Description     |
| ------ | -------- | --------------- |
| GET    | /users   | Fetch all users |
| POST   | /users   | Create new user |

---

## 🔁 CI/CD Pipeline

* Build Spring Boot application
* Build Docker image
* Push image to Docker Hub
* Deploy backend to EC2

---

## ⚠️ Challenges Faced

* Handling CORS between frontend and backend
* Debugging Docker container networking
* Data loss due to lack of persistence
* Nginx configuration and reverse proxy errors
* Synchronization issues between local, GitHub, and EC2

---

## 💡 Key Learnings

* Real-world DevOps workflow from development to deployment
* Container lifecycle and networking using Docker
* Reverse proxy design using Nginx
* Importance of persistent storage in production
* Debugging distributed system issues

---

## 📌 Future Improvements

* 🔐 Add HTTPS using Let's Encrypt
* 🌍 Integrate custom domain
* 🐳 Use Docker Compose for full orchestration
* 🔄 Automate frontend deployment
* 🔑 Implement authentication (JWT)

---

## 👨‍💻 Author

**Parv Chandegara**

---

## ⭐ Project Highlights

This project demonstrates **end-to-end DevOps implementation**, including deployment, debugging, and infrastructure setup — skills directly applicable to production environments.
